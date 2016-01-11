package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.SQLException;

/**
 * Created by serzh on 1/10/16.
 */ //"postgres", "postgres", "1qwerty"
public class Main {

    public static void main(String[] args) throws SQLException {

        EditColumns editColumns = new EditColumns("postgres", "postgres", "1qwerty");
        String tableEmployees = "employees";
        String columnFirst_name = "first_name";
        String columnLast_name = "last_name";
        editColumns.searchColumnOnColumnLike(tableEmployees, columnLast_name, "Pupk", columnFirst_name);
//        editColumns.searchTableContents();
//        DatabaseManager manager = new DatabaseManager("postgres", "postgres", "1qwerty");
//        manager.retrieveContentsOfaTable(tableEmployees, columnFirst_name, columnLast_name);
//        editColumns.InsertRecordInTable(tableEmployees, columnFirst_name, columnLast_name, "Vasia4", "Pupkin");
//        editColumns.deleteRowOnId(tableEmployees,9);

    }
}
