package ua.com.juja.algorithms.bubbleSort;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by serzh on 12/1/15.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{4, 1, 9, 3, 0};
//        bubbleSort(array);
        bubbleSortVoid(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] bubbleSort(int[] array) {
        bubbleSortVoid(array);
        return array;
    }

    private static void bubbleSortVoid(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /*public void sort(ArrayList data) {
        int size = data.size();
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - j - 1; i++) {
                if (data.get(i).compareTo(data.get(i + 1)) > 0) {
                    data.swap(i, i + 1);
                }
            }
        }
    }*/
}
