package ua.com.juja.A1FirstWeek.Algoritms.Lab16;

import java.util.Arrays;

/**
 * Created by Oleg on 11/26/2015.
 */
public class InsertionSorter {
    public static void main(String[] args) {
        int[] array = {6,3,2,1,7};
        InsertionSorter.sort(array);
        System.out.println(Arrays.toString(array));
        /*int bs = Arrays.binarySearch(array, 7);
        System.out.println(bs);*/
    }

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}