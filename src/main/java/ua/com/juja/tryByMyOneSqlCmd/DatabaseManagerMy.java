package ua.com.juja.tryByMyOneSqlCmd;

/**
 * Created by serzh on 1/23/16.
 */
public interface DatabaseManagerMy {



    void InsertRecordInTable(String table, String columnA, String columnB, String value1, String valie2);

    void updateValueInColumnOnId(String table, int id, String column, String newValue);

    void deleteRowOnId(String table, int id);

    void insertDanger(String table, int id, String first_name, String last_name);

    void searchColumnOnColumnLike(String table, String column, String seach, String printTo);

    void seachRowOnId(String table, int id, String column);

    void InsertRecordinTableTest();
}
