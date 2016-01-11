package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.*;
//проба

/**
 * Created by Oleg on 1/10/2016.
 */
public class DatabaseManager extends DatManager{


    public DatabaseManager(String dbname, String username, String password) {
        super(dbname, username, password);
    }

    protected void removeTable(String table) throws SQLException {
        String query3 = "drop table " + table;
        stmt.execute(query3);
        System.out.println("Employees table removed");
    }

    protected void removeColumn(String column) throws SQLException {
        String query2 = "ALTER TABLE employees DROP COLUMN " + column;
        stmt.execute(query2);
        System.out.println(column + " column removed from the table");
    }

    protected void addColumn(String column, int numOfChars) throws SQLException {
        String query1 = "ALTER TABLE employees ADD " + column + " CHAR (" + numOfChars + ") ";
        stmt.execute(query1);
        System.out.println(column + " column with " + numOfChars + "number of chars added to the table");
    }

    protected void createTable() throws SQLException {
        String query = "CREATE TABLE employees(id INTEGER PRIMARY KEY, first_name CHAR(50),last_name CHAR(75))";
        stmt.execute(query);
        System.out.println("Employee table created");
    }

    protected void getNumOfRowsInTable(String table) throws SQLException {
        int num_of_rows = 0;
        ResultSet rs = stmt.executeQuery
                ("SELECT * FROM " + table);
        while (rs.next()) {
            num_of_rows++;
        }
        System.out.println("There are " + num_of_rows
                + " record in the table");
    }

    protected void retrieveContentsOfaTable(String table, String columnA,String columnB) {
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + table);
            System.out.println("id " + columnA + " " + columnB);
            while (rs.next()) {
                int id = rs.getInt("id");
                String column1 = rs.getString(columnA);
                String column2 = rs.getString(columnB);
                System.out.println(id + " " + column1 + " " + column2);
            }
        } catch (SQLException e) {
            System.out.println("SQL exception occured" + e);
        }
    }


}
