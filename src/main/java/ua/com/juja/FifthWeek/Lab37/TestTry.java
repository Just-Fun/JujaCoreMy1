package ua.com.juja.FifthWeek.Lab37;

import static java.lang.Math.abs;

/**
 * Created by serzh on 12/24/15.
 */
public class TestTry {

    public static void main(String[] args) {

        int num = -2147483648;
        int num2 = 10;
        int result = num % num2;
        System.out.println(result);
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);
        System.out.println(abs(minValue));
        System.out.println(abs(-2147483647));
    }
}
