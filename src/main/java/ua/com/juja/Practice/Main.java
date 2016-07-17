package ua.com.juja.Practice;

import java.text.DateFormatSymbols;

/**
 * Created by serzh on 17.07.16.
 */
public class Main {

    public static void main(String[] args) {

        int a = sum(1,3,6);
        int i = 7 / 2;
        System.out.println(a);

    }

    private static int sumLambda(int... num) {
        int result = 0;
        return  result;
    }

    private static int sum(int... num) {
        int result = 0;
        for (int i : num) {
            result += i;
        }
        return result;
    }


}
