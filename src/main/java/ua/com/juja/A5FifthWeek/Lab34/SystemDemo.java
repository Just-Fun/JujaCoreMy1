package ua.com.juja.A5FifthWeek.Lab34;

/**
 * Created by serzh on 12/24/15.
 */
public class SystemDemo {

    public static void main(String[] args) {

        int arr1[] = {0, 1, 2, 3, 4, 5};
        int arr2[] = {0, 10, 20, 30, 40, 50};

        // copies an array from the specified source array
        System.arraycopy(arr1, 0, arr2, 0, arr2.length);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
