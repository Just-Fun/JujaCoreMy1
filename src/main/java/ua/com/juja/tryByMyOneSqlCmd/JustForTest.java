package ua.com.juja.tryByMyOneSqlCmd;

/**
 * Created by serzh on 1/10/16.
 */
public class JustForTest {

    public static void main(String[] args) {

        String dbname = "postgres";
        String username = "postgres";
        String password = "1qwerty";
        String s = " \"jdbc:postgresql://127.0.0.1:5432/" + dbname + "\", \"" + username + "\", \"" + password + "\" ";
        System.out.println(s);
    }
}
