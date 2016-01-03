package ua.com.juja.sqlcmd;

import java.sql.*;
import java.util.Random;

/**
 * Created by serzh on 1/3/16.
 */
public class Main {

    public static void main(String[] argv) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/sqlcmd", "postgres",
                "1qwerty");
//      insert
        Statement stmt = connection.createStatement();

        String sql = "INSERT INTO public.user " +
                "VALUES ('Stiven11', 'Pupkin11')";
        stmt.executeUpdate(sql);

        stmt.executeUpdate("INSERT INTO public.user (name, password)" +
                "VALUES ('Stiven12', 'Pupkin12')");

//        select

        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM public.user WHERE id > 5");
        while (rs.next()) {
            System.out.println("id: " + rs.getString("id"));
            System.out.println("name: " + rs.getString("name"));
            System.out.println("password: " + rs.getString("password"));
            System.out.println("------");
        }
        rs.close();
        stmt.close();

        // table names
        stmt = connection.createStatement();
        rs = stmt.executeQuery("SELECT table_name FROM information_schema.tables " +
                "WHERE table_schema = 'public'AND table_type = 'BASE TABLE'");

        while (rs.next()) {
            System.out.println("table: " + rs.getString("table_name"));
        }
        rs.close();
        stmt.close();

        // delete
        stmt = connection.createStatement();
        stmt.executeUpdate("DELETE FROM public.user " +
                "WHERE id > 10 and id < 100");
        stmt.close();

        //update
        PreparedStatement ps = connection.prepareStatement(
                "UPDATE public.user SET password = ? WHERE id > 3");
        int pass = new Random().nextInt();
        ps.setString(1, "password_" + pass);
        ps.executeUpdate();
        ps.close();

        connection.close();
    }
}
