package ua.com.juja.FirstWeek.Algoritms.LAB20;

import java.util.Arrays;

/**
 * Created by Oleg on 11/28/2015.
 */
public class Permutator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
    }

    public static void permutation(int[] list, int size) {
        // печатаем лист как есть
        System.out.println(Arrays.toString(list));
        //для цикла из всех
        for (int i = 0; i < list.length; i++) {

        }
    }

    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}
