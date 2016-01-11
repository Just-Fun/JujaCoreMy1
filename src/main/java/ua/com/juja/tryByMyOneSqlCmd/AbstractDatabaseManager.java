package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by serzh on 1/10/16.
 */
public abstract class AbstractDatabaseManager {

    Connection connection;
    Statement stmt;

    String dbname;
    String username;
    String password;

    public AbstractDatabaseManager(String dbname, String username, String password) {
        this.dbname = dbname;
        this.username = username;
        this.password = password;

        this.connection = connect(dbname, username, password);

        try {
            this.stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection connect(String dbname, String username, String password) {

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Ok");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? " + e);
            e.printStackTrace();
        }

        Connection connection = null;
        String hostname = "jdbc:postgresql://127.0.0.1:5432/" + dbname;
        try {
            connection = DriverManager.getConnection(hostname, username, password);

            System.out.println("connection to postgres Ok");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            System.out.println("SQL exception occured" + e);
        }
        return connection;
    }
}
