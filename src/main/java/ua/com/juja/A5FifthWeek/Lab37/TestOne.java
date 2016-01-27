package ua.com.juja.A5FifthWeek.Lab37;

/**
 * Created by serzh on 12/24/15.
 */
public class TestOne {

    public static void main(String[] args) {
        String actual = StringUtils.rightShift("ABC", 1);
        String expected = "CAB";

        if (!actual.equals(expected)) {
            System.out.print("Must be " + expected + " , but " + actual);
        } else {

            System.out.print("1 ABC OK");
        }
    }
}
