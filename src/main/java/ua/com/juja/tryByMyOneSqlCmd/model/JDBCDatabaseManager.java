package ua.com.juja.tryByMyOneSqlCmd.model;

import java.sql.Connection;

/**
 * Created by serzh on 1/23/16.
 */
public class JDBCDatabaseManager implements DatabaseManager{

    private Connection connection;

    @Override
    public DataSet[] getTableData(String tableName) {
        return new DataSet[0];
    }

    @Override
    public String[] getTableNames() {
        return new String[0];
    }

    @Override
    public void connect(String database, String userName, String password) {

    }

    @Override
    public void clear(String tableName) {

    }

    @Override
    public void create(DataSet input) {

    }

    @Override
    public void update(String tableName, int id, DataSet newValue) {

    }
}
