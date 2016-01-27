package ua.com.juja.A5FifthWeek.Lab37;

/**
 * Created by serzh on 12/24/15.
 */
public class TestMinus8 {

    public static void main(String[] args) {
        // Integer.MIN_VALUE = -2147483648
        int num = -8;
        String actual = StringUtils.rightShift("0123456789", num);
        String expected = "8901234567";

        if (!actual.equals(expected)) {
            System.out.print("Must be " + expected + " , but " + actual);
        } else {

            System.out.print("OK");
        }
    }
}
