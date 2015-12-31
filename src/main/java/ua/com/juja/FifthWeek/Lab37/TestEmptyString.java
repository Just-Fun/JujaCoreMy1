package ua.com.juja.FifthWeek.Lab37;


/**
 * Created by serzh on 12/24/15.
 */
public class TestEmptyString {

    public static void main(String[] args) {
        String actual = StringUtils.rightShift("", -1000000);
        String expected = "";

        if (!actual.equals(expected)) {
            System.out.print("Must be " + expected + " , but " + actual);
        }

        System.out.print("TestEmptyString OK");
    }
}
