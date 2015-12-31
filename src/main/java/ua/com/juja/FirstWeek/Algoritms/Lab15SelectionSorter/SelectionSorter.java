package ua.com.juja.FirstWeek.Algoritms.Lab15SelectionSorter;

import java.util.Arrays;

/**
 * Created by Oleg on 11/24/2015.
 */
public class SelectionSorter {
    public static void main(String[] args) {
        int[] ans = {3, 4, 6, 1, 3};
        SelectionSorter.sort(ans);
        System.out.println(Arrays.toString(ans));
    }


    public static void sort(int[] arr) {
        int count = 0;
        int countFor = 0;
        int min;
        int i = 0;
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                countFor++;
                min = arr[barrier];
                if (min > arr[index]) {
                    min = arr[index];
                    i = index;
                }
                arr[i] = arr[barrier];
                arr[barrier] =  min;
                count++;
            }
        }
        System.out.println(count);
        System.out.println("countFor: " + countFor);
    }
}

