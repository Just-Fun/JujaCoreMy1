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
//        editColumns.InsertRecordinTable("employees" ,"first_name", "last_name", "Vasia8","Pupkin" );
//        editColumns.InsertRecordinTableTest();
        editColumns.updateColumnOnId(tableEmployees,columnFirst_name, 5, "Evlantii");


    }
}
