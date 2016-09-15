package ua.com.juja.algoritms.LAB20_Permutator;

import java.util.Arrays;

/**
 * Created by Oleg on 11/28/2015.
 */
public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        permutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void permutation(int[] list) {
        int length = list.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = list[i];
            list[i] = list[length - 1 - i];
            list[length - 1 - i] = tmp;
        }
    }
}
