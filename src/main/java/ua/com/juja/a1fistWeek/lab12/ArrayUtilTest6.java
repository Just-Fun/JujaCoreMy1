package ua.com.juja.a1fistWeek.lab12;

import java.util.Arrays;

/**
 * Created by Serzh on 8/26/16.
 */
public class ArrayUtilTest6 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        int[] expected = {6, 9};
        int[] actual = ArrayUtils2.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
