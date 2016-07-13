package ua.com.juja.EmailHideTest;

/**
 * Created by serzh on 12/29/15.
 */
public class Main {

    public static void main(String[] args) {

        String myEmail;
        try {
            myEmail = PathToEmailStatic.getMyEmail();
        } catch (Exception e) {
            myEmail = "example@mail.com";
        }
        System.out.println(myEmail);
    }
}
