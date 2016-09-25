package ua.com.juja.algorithms.LAB20_Permutator;

import java.util.Arrays;

/**
 * Created by serzh on 12/11/15.
 */
public class Perm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }
    public static void permutation(int[] arr, int size) {
        if (size == 2) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                permutation(arr, size - 1);
            }
        }
    }
    public static void swap(int[] arr, int index0, int index1) {
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
