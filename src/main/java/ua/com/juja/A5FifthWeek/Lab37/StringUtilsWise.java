package ua.com.juja.A5FifthWeek.Lab37;

import static java.lang.Math.abs;

/**
 * Created by serzh on 12/24/15.
 */
//("ABCDE", -1) = "BCDEA", ("ABCDE", -2) = "CDEAB", ("ABCDE", -7) = "CDEAB"

public class StringUtilsWise {

    public static void main(String[] args) {

        System.out.println(rightShift("ABCDE", 1000));
    }

    public static String rightShift(String arg, int delta) {

        int absDelta = abs(delta);
        for (int i = 0; i < absDelta; i++) {
            String first = arg.substring(1, arg.length());
            String second = arg.substring(0, 1);
            arg = first.concat(second);
        }
        return arg;
    }
}
