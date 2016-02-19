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
       /* int object = 2;
        int[] newList = null;
        for (int i = 0; i < list.length; i++) {
            if (object == (list[i])) {
                newList = new int[list.length - 1];

                for (int j = 0; j < i; j++) {
                    newList[j] = list[j];
                }
                for (int k = i + 1; k < list.length; k++) {
                    newList[k - 1] = list[k];
                }
                list = newList;

            }
        }
*/
        /*int index = 1;
        int object = 5;
        int[] newList = new int[list.length + 1];
        for (int i = 0; i < index; i++) {
            newList[i] = list[i];
        }
        newList[index] = object;
        for (int j = index + 1; j < newList.length; j++) {
            newList[j] = list[j - 1];

        }
        list = newList;*/

        int[] newList = new int[list.length - 1];
        int index = 1;
        for (int i = 0; i < index; i++) {
            newList[i] = list[i];
        }
        for (int j = index; j < newList.length; j++) {
            newList[j] = list[j + 1];

        }
        list = newList;

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
