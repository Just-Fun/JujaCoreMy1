package ua.com.juja.A1FirstWeek;

import java.util.ArrayList;

/**
 * Created by Oleg on 11/21/2015.
 * lookFor([0, -1, 0, -1]) = [] // нету положительных чисел
 */
public class ArrayUtils {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int[] lookFor(int[] array) {
        int indexLeft = 0;
        int indexRight = 0;
        String arr = "arr";
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] ans;
        int check = 0;
        for (int i : array) {
            if (i > 0) check++;
        }

        if (check == 0) {
            ans =  new int[0];
            return ans;
        } else {

            for (int i = 0; i < array.length; i++) {
                arrayList.add(array[i]);
            }
            arr += check;
            /*ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i <arrayList.size(); i++) {

                if (arrayList.get(i) > 0) {

                }
            }*/


            ans = new int[]{indexLeft,indexRight};
            return ans;
        }
    }
}
