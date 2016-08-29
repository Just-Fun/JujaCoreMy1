package ua.com.juja.a1fistWeek.lab12;

/**
 * Created by Serzh on 8/26/16.
 */

public class ArrayUtils {
    public static int[] lookFor(int[] array) {
        int[] ans = new int[2];
        boolean check = false;
        int x = -1;
        int y = -1;
        int count = 0;
        int first = 0;
        int last = 0;
        int countTemp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                if (!check) {
                    x = i;
                    check = true;
                }
                count++;
                if (i == array.length - 1) { // if int the last in the array
                    y = i;
                    if (count > countTemp) {
                        first = x;
                        last = y;
                        countTemp = count;
                    }
                }
            } else {
                if (i > 0 && array[i - 1] > 0) {
                    y = i - 1;
                    if (count > countTemp) {
                        first = x;
                        last = y;
                        countTemp = count;
                    }
                    check = false;
                    count = 0;
                }
            }
        }
        if (x == -1 && y == -1) {
            return new int[0];
        }
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
}
