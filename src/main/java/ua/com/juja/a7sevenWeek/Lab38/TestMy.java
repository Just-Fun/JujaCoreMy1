package ua.com.juja.a7sevenWeek.Lab38;

import java.util.Arrays;

/**
 * Created by serzh on 1/14/16.
 */
public class TestMy {

    public static void main(String[] args) {

        int[] testDelta = {100, 343, 245};
        int[] copy = Arrays.copyOf(testDelta, testDelta.length);
        testDelta[0] = 5;
        testDelta = Arrays.copyOf(copy, copy.length);

        System.out.println(Arrays.toString(testDelta));
    }
}
