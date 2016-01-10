package ua.com.juja.tryByMyOneSqlCmd;

import java.sql.SQLException;

/**
 * Created by serzh on 1/10/16.
 */
public class EditColumns extends DatManager{


    protected void InsertRecordinTable(String table,String columnA,String columnB, String value1, String valie2) {
        String sql = "INSERT INTO " + table + " (" + columnA +", "+ columnB +") VALUES ('" + value1 + "', '" +valie2 + "')";
        executeAndClose(sql);
    }

    protected void updateColumnOnId(String table,String column, int id, String newValue) {
        String query1="update " + table + " set " + column + "='" + newValue + "' where id=" + id;
    }

    /*
    String query1="update emp set name='ravi' where id=2";
         String query2 = "delete  from emp where id=1";
         String query3 = "insert into emp values
     */



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
