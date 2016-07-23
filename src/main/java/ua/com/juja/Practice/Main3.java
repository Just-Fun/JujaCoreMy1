package ua.com.juja.Practice;

import java.util.Arrays;

/**
 * Created by serzh on 23.07.16.
 */
public class Main3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        Integer[] array1 = new Integer[4];
        array1[0] = 11;
        array1[1] = 12;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Arrays.copyOf(array1, 2)));
    }
}
