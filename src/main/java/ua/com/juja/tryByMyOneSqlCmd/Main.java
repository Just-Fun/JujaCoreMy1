package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.SQLException;

/**
 * Created by serzh on 1/10/16.
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        DatabaseManager manager = new DatabaseManager();
//        manager.addColumn();
//        manager.removeColumn("postindex2");
        EditColumns editColumns = new EditColumns();
        editColumns.InsertRecordinTable("employees" ,"first_name", "last_name", "Vasia6","Pupkin" );
//        editColumns.InsertRecordinTableTest();
    }
}
