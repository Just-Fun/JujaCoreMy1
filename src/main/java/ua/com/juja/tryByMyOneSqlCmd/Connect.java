package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by serzh on 1/10/16.
 */
public class Connect {
    public static Connection connect() {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Ok");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? " + e);
            e.printStackTrace();
        }

        Connection connection = null;
        try {
            connection = DriverManager.getConnection( // "jdbc:postgresql://hostname:port/dbname","username", "password");
                    "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1qwerty");
            // "jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "1qwerty");
            // dbname,username = postgres, password = 1qwerty
            System.out.println("connection to postgres Ok");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            System.out.println("SQL exception occured" + e);
        }
        return connection;
    }

}
