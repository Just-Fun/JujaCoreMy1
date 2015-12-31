package ua.com.juja.FifthWeek.mirror;

/**
 * Created by serzh on 12/31/15.
 */
public class Mirror {

    public void UpDown(int[][] array) {
        int size = array.length;
        if (size <= 1) return;

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size / 2; y++) {

                int temp = array[y][x];
                array[y][x] = array[size - 1- y][x];
                array[size - 1 - y][x] = temp;

            }
        }
    }
}
