package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.SQLException;

/**
 * Created by serzh on 1/10/16.
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        EditColumns editColumns = new EditColumns("postgres", "postgres", "1qwerty");
        String tableEmployees = "employees";
        String columnFirst_name = "first_name";
        //"postgres", "postgres", "1qwerty"
        //DatabaseManager manager = new DatabaseManager();
//        manager.addColumn();
//        manager.removeColumn("postindex2");
//        editColumns.InsertRecordinTableTest();
//        editColumns.updateValueInColumnOnId(tableEmployees,columnFirst_name, 5, "Evlantii");
//        editColumns.deleteRowOnId(tableEmployees,9);
        editColumns.insertDanger(tableEmployees, 14, "Elwis", "Preslei");



//        editColumns.InsertRecordInTable("employees" ,"first_name", "last_name", "Vasia11","Pupkin" );

    }
}
