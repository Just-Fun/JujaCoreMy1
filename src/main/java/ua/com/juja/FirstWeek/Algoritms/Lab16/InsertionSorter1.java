package ua.com.juja.FirstWeek.Algoritms.Lab16;

import java.util.Arrays;

/**
 * Created by Oleg on 11/26/2015.
 */
public class InsertionSorter1 {
    public static void main(String[] args) {
        int[] array = {6,3,2,1,7};
//        int[] array2 = {1,2,5,6,6,6,6};
        InsertionSorter.sort(array);
        System.out.println(Arrays.toString(array));
//        int bs = Arrays.binarySearch(array, 7);
//        System.arraycopy(array, 0, array2, 1, 2);
//        System.out.println(bs);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
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