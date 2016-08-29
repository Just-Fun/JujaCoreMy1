package ua.com.juja.practice;

import java.util.ArrayList;
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
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,5));
        list.trimToSize();
        System.out.println(list.toString());
        System.out.println(Arrays.toString(Arrays.copyOf(array1, 2)));

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(35);
        arrlist.add(20);
        arrlist.add(25);

        // Trim the arraylist
        arrlist.trimToSize();
    }
}
