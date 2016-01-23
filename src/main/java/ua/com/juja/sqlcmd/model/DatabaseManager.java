package ua.com.juja.sqlcmd.model;

/**
 * Created by serzh on 1/11/16.
 */
public interface DatabaseManager {

    DataSet[] getTableData(String tableName);

    String[] getTableNames();

    void connect(String database, String userName, String password);

    void clear(String tableName);

    void create(String tableName, DataSet input);

    void update(String tableName, int id, DataSet newValue);

    String[] getTableColumns(String tableName);
}
