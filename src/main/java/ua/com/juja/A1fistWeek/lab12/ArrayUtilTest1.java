package ua.com.juja.A1fistWeek.lab12;

import java.util.Arrays;

/**
 * Created by Serzh on 8/26/16.
 */
public class ArrayUtilTest1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1};
        int[] expected = {0, 2};
        int[] actual = ArrayUtils2.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
