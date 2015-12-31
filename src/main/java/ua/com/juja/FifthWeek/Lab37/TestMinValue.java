package ua.com.juja.FifthWeek.Lab37;

/**
 * Created by serzh on 12/24/15.
 */
public class TestMinValue {

    public static void main(String[] args) {
        // Integer.MIN_VALUE = -2147483648
        String actual = StringUtils.rightShift("0123456789", Integer.MIN_VALUE);
        String expected = "8901234567";

        if (!actual.equals(expected)) {
            System.out.print("Must be " + expected + " , but " + actual);
        } else {

            System.out.print("OK");
        }
    }
}
