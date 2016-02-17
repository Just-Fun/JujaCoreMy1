package ua.com.juja.patterns.Iterator.sample;

import java.util.*;

/**
 * Created by serzh on 2/17/16.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        int[] arr2 = new int[4];
//        arr2 = Arrays.copyOf(arr1,3);
//        arr2 = Arrays.copyOfRange(arr1, 0, arr1.length);
      /*  for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];

        }
        arr2[3] = 7;*/
        int object = 2;
        int newList[] = new int[list.length - 1];;

        for (int i = 0; i < list.length; i++) {
            if (object == (list[i])) {

                for (int j = 0; j < i; j++) {
                    newList[j] = list[j];
                }
                for (int k = i + 1; k < list.length; k++) {
                    newList[k] = list[k - 1];
                }

            }
        }

        for (int i = 0; i < list.length - 1; i++) {
            System.out.println(newList[i]);
        }

    }
}
