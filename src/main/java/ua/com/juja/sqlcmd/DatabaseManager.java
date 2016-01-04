package ua.com.juja.sqlcmd;

import java.sql.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by serzh on 1/3/16.
 */
public class DatabaseManager {

    private Connection connection;

    public static void main(String[] argv) throws ClassNotFoundException, SQLException {


        String database = "sqlcmd";
        String user = "postgres";
        String password = "1qwerty";

        DatabaseManager manager = new DatabaseManager();

        manager.connect(database, user, password);
        Connection connection = manager.getConnection();

        String insert = "INSERT INTO public.user " + // or "INSERT INTO public.user (name, password)"
                "VALUES ('Stiven11', 'Pupkin11')";
        insert(connection, insert);

        // select
        String[] tables = manager.getTablesNames();
        System.out.println(Arrays.toString(tables));

        String tableName = "user";

        Statement stmt = connection.createStatement();
        ResultSet rsCount = stmt.executeQuery("SELECT COUNT(*) FROM public." + tableName);
        rsCount.next();
        int size = rsCount.getInt(1);
        System.out.println(size);

        ResultSet rs = stmt.executeQuery("SELECT * FROM public." + tableName);
        ResultSetMetaData rsmd = rs.getMetaData();
        DataSet[] result = new DataSet[size];
        int index = 0;

//       select(connection, select);
        while (rs.next()) {
            DataSet dataSet = new DataSet();
            result[index++] = dataSet;
            dataSet.put(rsmd.getColumnName(1), rs.getObject(1));
        }
        rs.close();
        stmt.close();

        // delete == insert
        String delete = "DELETE FROM public.user " +
                "WHERE id > 10 and id < 100";
        insert(connection, delete);

        //update
        String update = "UPDATE public.user SET password = ? WHERE id > 3";
        update(connection, update);

        connection.close();
    }

    /*private static void select(Connection connection, String sql1) throws SQLException {
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
    }*/

    public String[] getTablesNames() {
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT table_name FROM information_schema.tables " +
                    "WHERE table_schema = 'public'AND table_type = 'BASE TABLE'");

            String[] tables = new String[100];
            int index = 0;
            while (rs.next()) {
                tables[index++] = (rs.getString("table_name"));
            }
            tables = Arrays.copyOf(tables, index, String[].class);
            rs.close();
            stmt.close();
            return tables;
        } catch (SQLException e) {
            e.printStackTrace();
            return new String[0];
        }
    }

    public void connect(String database, String user, String password) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Please add jbcd jar to project.");
        }
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/" + database, user,
                    password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(String.format("Can't get connection for database:%s user:%s", database, user));
            connection = null;
        }
    }

    private static void update(Connection connection, String update) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
                update);
        int pass = new Random().nextInt();
        ps.setString(1, "password_" + pass);
        ps.executeUpdate();
        ps.close();
    }

    private static void insert(Connection connection, String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }

    private Connection getConnection() {
        return connection;
    }
}
