package ua.com.juja.sqlcmd;

import java.sql.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by serzh on 1/3/16.
 */
public class DatabaseManager {

    public static void main(String[] argv) throws ClassNotFoundException, SQLException {


        String database = "sqlcmd";
        String user = "postgres";
        String password = "1qwerty";

        Connection connection = getConnection(database, user, password);

        String insert = "INSERT INTO public.user " + // or "INSERT INTO public.user (name, password)"
                "VALUES ('Stiven11', 'Pupkin11')";
        insert(connection, insert);

        // select
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT table_name FROM information_schema.tables " +
                "WHERE table_schema = 'public'AND table_type = 'BASE TABLE'");

        String[] tables = new String[100];
        int index = 0;
        while (rs.next()) {
           tables[index++] = ("table: " + rs.getString("table_name"));
        }
        tables = Arrays.copyOf(tables, index + 1, String[].class);
        rs.close();
        stmt.close();

        String select = "SELECT * FROM public.user WHERE id > 5";
        select(connection, select);


        // delete == insert
        String delete = "DELETE FROM public.user " +
                "WHERE id > 10 and id < 100";
        insert(connection, delete);

        //update
        String update = "UPDATE public.user SET password = ? WHERE id > 3";
        update(connection, update);

        connection.close();
    }

    private static Connection getConnection(String database, String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/" + database, user,
                password);
    }

    private static void update(Connection connection, String update) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                update);
        int pass = new Random().nextInt();
        ps.setString(1, "password_" + pass);
        ps.executeUpdate();
        ps.close();
    }

    private static void select(Connection connection, String sql1) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql1);
        while (rs.next()) {
            System.out.println("id: " + rs.getString("id"));
            System.out.println("name: " + rs.getString("name"));
            System.out.println("password: " + rs.getString("password"));
            System.out.println("------");
        }
        rs.close();
        stmt.close();
    }

    private static void insert(Connection connection, String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }
}
