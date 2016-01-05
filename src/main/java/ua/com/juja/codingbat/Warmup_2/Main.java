package ua.com.juja.codingbat.Warmup_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by serzh on 1/5/16.
 */
public class Main {

    public static void main(String[] args) {
//        stringTimes("Hi", 5);
//        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(doubleX("xfx"));

    }

    static boolean doubleX(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'x') {
                if (chars[i] == chars[i + 1]) {
                    return true;
                }
                break;
            }

        }
        return  false;
    }

    static int countXX(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'x' && chars[i + 1] == 'x') count++;

        }
        return count;
    }

    public static String stringTimes(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;

        }
        return result;
    }

    public static String frontTimes(String str, int n) {
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;

        }
        return result;
    }

}
