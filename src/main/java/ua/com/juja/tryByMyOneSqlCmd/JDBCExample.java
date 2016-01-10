package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//проба
/**
 * Created by Oleg on 1/10/2016.
 */
public class JDBCExample {

    public static void main(String[] argv) throws SQLException {

        if (connectToDriver()) return;
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
                    "1qwerty"); // "jdbc:postgresql://hostname:port/dbname","username", "password");
            System.out.println("connection to postgres Ok");
        } catch (SQLException e) {
        System.out.println("Connection Failed! Check output console");
        return;
        }

        Statement stmt = connection.createStatement();

//        String query = "CREATE TABLE employees(id INTEGER PRIMARY KEY, first_name CHAR(50),last_name CHAR(75))";
//        stmt.execute(query);
//        System.out.println("Employee table created");
//        String query1 = "aLTER TABLE employees ADD address CHAR (100) ";
//        String query2 = "ALTER TABLE employees DROP COLUMN last_name ";
//        stmt.execute(query1);
//        stmt.execute(query2);
//        System.out.println("Address column added to the table & last_name column removed from the table");
        String query3 = "drop table employees";
        stmt.execute(query3);
        System.out.println("Employees table removed");
    }

    private static boolean connectToDriver() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Ok");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? ");
            e.printStackTrace();
            return true;
        }
        return false;
    }
}
