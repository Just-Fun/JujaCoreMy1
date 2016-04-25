package ua.com.juja.tryByMyOneSqlCmd;

/**
 * Created by serzh on 1/10/16.
 */
public class JustForTest {

    public static void main(String[] args) {

        String dbname = "sqlsmd";
        String username = "postgres";
        String password = "postgres";
        String s = " \"jdbc:postgresql://127.0.0.1:5432/" + dbname + "\", \"" + username + "\", \"" + password + "\" ";

        //        String query1 = String.format("INSERT into " + table + " values(" + id + ", " + first_name + ", " + last_name + ")";
        String s1 = String.format("insert into employees values('%s', '%s', '%s')", dbname, username, password);

        System.out.println(s);
        System.out.println(s1);
    }
}
