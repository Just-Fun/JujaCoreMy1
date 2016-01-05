package ua.com.juja.sqlcmd;

import java.sql.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by serzh on 1/3/16.
 */
public class DatabaseManagerMy {

    private Connection connection;

    public static void main(String[] argv) throws ClassNotFoundException, SQLException {


        String database = "sqlcmd";
        String user = "postgres";
        String password = "1qwerty";

        DatabaseManagerMy manager = new DatabaseManagerMy();

        manager.connect(database, user, password);
        Connection connection = manager.getConnection();

        String insert = "INSERT INTO public.user " + // or "INSERT INTO public.user (name, password)"
                "VALUES ('Stiven1', 'Pupkin1')";
        insert(connection, insert);

        // select
        String[] tables = manager.getTablesNames();
        System.out.println(Arrays.toString(tables));

        String tableName = "user";

        DataSetMy[] result = manager.getTableData(tableName);

        System.out.println(Arrays.toString(result));

        // delete == insert
        String delete = "DELETE FROM public.user " +
                "WHERE id > 10 and id < 100";
        insert(connection, delete);

        //update
        String update = "UPDATE public.user SET password = ? WHERE id > 3";
        update(connection, update);

        connection.close();
    }

    public DataSetMy[] getTableData(String tableName) throws SQLException {
        int size = getSize(tableName);

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM public." + tableName);
        ResultSetMetaData rsmd = rs.getMetaData();
        DataSetMy[] result = new DataSetMy[size];
        int index = 0;

//       select(connection, select);
        while (rs.next()) {
            DataSetMy dataSet = new DataSetMy();
            result[index++] = dataSet;
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                dataSet.put(rsmd.getColumnName(1), rs.getObject(1));
            }
        }
        rs.close();
        stmt.close();
        return result;
    }

    private int getSize(String tableName) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rsCount = stmt.executeQuery("SELECT COUNT(*) FROM public." + tableName);
        rsCount.next();
        int size = rsCount.getInt(1);
        rsCount.close();
        return size;
    }

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
        PreparedStatement ps = connection.prepareStatement(update);
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
