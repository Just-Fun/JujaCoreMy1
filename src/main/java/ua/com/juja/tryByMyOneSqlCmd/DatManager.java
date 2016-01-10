package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by serzh on 1/10/16.
 */
public abstract class DatManager {

    Connection connection;
    Statement stmt;

    public DatManager() {

        this.connection = Connect.connect(/*"postgres", "postgres", "1qwerty"*/);

        try {
            this.stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
