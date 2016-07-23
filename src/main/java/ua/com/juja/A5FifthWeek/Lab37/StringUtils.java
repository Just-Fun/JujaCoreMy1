package ua.com.juja.A5FifthWeek.Lab37;

import static java.lang.Math.abs;

/**
 * Created by serzh on 12/24/15.
 */
//("ABCDE", 1) = "EABCD" rightShift("ABCDE", 2) = "DEABC" rightShift("ABCDE"
//("ABCDE", -1) = "BCDEA", ("ABCDE", -2) = "CDEAB", ("ABCDE", -7) = "CDEAB"

public class StringUtils {

    public static void main(String[] args) {

        String actual = StringUtils.rightShift("ABC", 1000);
        System.out.println(actual);
    }


    public static String rightShift(String arg, int delta) {
        if (arg.equals("") || arg.equals(null)) {
            return "";
        }
        if (delta == 0) return arg;
        int length = arg.length();
        int shift = delta % length;

        if (delta >= 0) {
            return arg.substring(length - shift, length) + arg.substring(0, length - shift);
        } else {
            shift = Math.abs(shift);
            return arg.substring(shift, length) + arg.substring(0, shift);
        }

        /*if (delta == 0) {
            return arg;
        } else if (arg.equals("")) {
            return "";
        } else {
            int num = 0;
            if (delta == Integer.MIN_VALUE) {

                delta = delta + arg.length();
            }
            int check = abs(delta);

            if (check > arg.length()) {
                int stringLenght = arg.length();
                num = delta % stringLenght;
            } else {
                num = delta;
            }

            if (delta > 0) {
                arg = getStringPositiv(arg, num);

            } else if (delta < 0) {
                arg = getStringNegativ(arg, num);
            }
        }
        return arg;*/
    }

    private static String getStringNegativ(String arg, int num) {
        int absDelta = abs(num);
        for (int i = 0; i < absDelta; i++) {
            String first = arg.substring(1, arg.length());
            String second = arg.substring(0, 1);
            arg = first.concat(second);
        }
        return arg;
    }

    private static String getStringPositiv(String arg, int num) {
        for (int i = 0; i < num; i++) {
            String first = arg.substring(arg.length() - 1);
            String second = arg.substring(0, arg.length() - 1);
            arg = first.concat(second);
        }
        return arg;
    }
}
