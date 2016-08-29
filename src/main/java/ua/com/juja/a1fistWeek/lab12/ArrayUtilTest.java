package ua.com.juja.a1fistWeek.lab12;

import java.util.Arrays;

/**
 * Created by Serzh on 8/26/16.
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {0, 4};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
