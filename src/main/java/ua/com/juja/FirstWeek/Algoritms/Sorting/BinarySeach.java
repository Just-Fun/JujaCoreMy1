package ua.com.juja.FirstWeek.Algoritms.Sorting;


import java.util.Arrays;

/**
 * Created by serzh on 1/5/16.
 */
public class BinarySeach {
    static int result = -1;

    public static void main(String[] args) {

        int[] temp = {1, 2, 3, 4, 5};
        int ans = binarySearch1(temp, 0, 4, 6);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int num) {
        return seach(arr, 0, arr.length - 1, num);
    }

    private static int seach(int[] arr, int from, int till, int num) {
        if (till < 0 || from > arr.length - 1) return result = -1;

        if (from == till) result = from;
        int mid = (from + till) / 2;
        if (arr[mid] == num) {
            return result = mid;
        } else if (num < arr[mid]) {
            seach(arr, from, mid - 1, num);
        } else if (num > arr[mid]) {
            seach(arr, mid + 1, till, num);
        }
        return result;
    }

    private static int binarySearch1(int[] list, int begin, int end, int query) {


        if (begin > end)
            return -1;
        int middle = (begin + end) / 2;
        if (list[middle] == query) {
            return middle;
        }
        if (list[middle] < query ) {
            return binarySearch1(list, begin, middle, query);
        }
        return binarySearch1(list, middle, end, query);
    }

}
