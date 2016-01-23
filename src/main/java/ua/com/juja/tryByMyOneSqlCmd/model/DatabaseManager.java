package ua.com.juja.tryByMyOneSqlCmd.model;

/**
 * Created by serzh on 1/23/16.
 */
public interface DatabaseManager {

    DataSet[] getTableData(String tableName);

    String[] getTableNames();

    void connect(String database, String userName, String password);

    void clear(String tableName);

    void create(DataSet input);

    void update(String tableName, int id, DataSet newValue);

    //

    /*void InsertRecordInTable(String table, String columnA, String columnB, String value1, String valie2);

    void updateValueInColumnOnId(String table, int id, String column, String newValue);

    void deleteRowOnId(String table, int id);

    void insertDanger(String table, int id, String first_name, String last_name);

    void searchColumnOnColumnLike(String table, String column, String seach, String printTo);

    void seachRowOnId(String table, int id, String column);

    void InsertRecordinTableTest();*/
}
