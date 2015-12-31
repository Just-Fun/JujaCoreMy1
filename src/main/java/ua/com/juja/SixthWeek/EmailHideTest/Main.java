package ua.com.juja.SixthWeek.EmailHideTest;

/**
 * Created by serzh on 12/29/15.
 */
public class Main {

    public static void main(String[] args) {

        String myEmail = null;
        try {
            myEmail = PathToEmailStatic.myEmail;
        } catch (Exception e) {
            myEmail = "example@mail.com";
        }
        System.out.println(myEmail);
    }
}
