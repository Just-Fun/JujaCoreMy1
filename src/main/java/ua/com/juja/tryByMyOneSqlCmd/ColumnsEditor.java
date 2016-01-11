package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by serzh on 1/10/16.
 */
public class ColumnsEditor extends AbstractDatabaseManager {


    public ColumnsEditor(String dbname, String username, String password) {
        super(dbname, username, password);
    }

    protected void InsertRecordInTable(String table, String columnA, String columnB, String value1, String valie2) {
        String sql = "INSERT INTO " + table + " (" + columnA + ", " + columnB + ") VALUES ('" + value1 + "', '" + valie2 + "')";
        executeAndClose(sql);
    }

    protected void updateValueInColumnOnId(String table, int id, String column, String newValue) {
        String query1 = "UPDATE " + table + " set " + column + "='" + newValue + "' where id=" + id;
        executeAndClose(query1); //String query1="update emp set name='ravi' where id=2";
    }

    protected void deleteRowOnId(String table, int id) {
        String query1 = "DELETE from " + table + " where id=" + id;
        executeAndClose(query1); // String query2 = "delete  from emp where id=1";
    }

    protected void insertDanger(String table, int id, String first_name, String last_name) {
        String query2 = String.format("insert into employees values( %s, '%s', '%s')", id, first_name, last_name);
        executeAndClose(query2); // String query3 = "insert into emp values (1,'ronak','manager')";

    }

    protected void searchColumnOnColumnLike(String table, String column, String seach, String printTo) {
        String query = "SELECT " + printTo + " from " + table + " where " + column + " like '" + seach + "%'";
        try {
            ResultSet rs = stmt.executeQuery(query);
            System.out.println(printTo + " for query " + query + " are");
            while (rs.next()) {
                String name = rs.getString(printTo);
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void seachRowOnId(String table, int id, String column) {
        String query = "SELECT * FROM employees where id=" + id;
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString(column);
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void InsertRecordinTableTest() {

        String sql = "INSERT INTO employees (first_name, last_name) VALUES ('Vasia3', 'Pupkin')";
        executeAndClose(sql);
    }

    private void executeAndClose(String sql) {
        try {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
