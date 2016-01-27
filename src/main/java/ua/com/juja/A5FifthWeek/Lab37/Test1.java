package ua.com.juja.A5FifthWeek.Lab37;

/**
 * Created by serzh on 12/24/15.
 */
/* rightShift("ABCDE", 1) = "EABCD" rightShift("ABCDE", 2) = "DEABC" rightShift("ABCDE"*/

public class Test1 {

    public static void main(String[] args) {

        String test = "ABCDE";
        int i = 2;

        String expected = "DEABC";
        String actual = StringUtils.rightShift(test, i);

        if (!expected.equals(actual)) {
            System.out.print("Must be " + expected + " , but " + actual);
        } else {

            System.out.print("OK");
        }
    }
}

