package ua.com.juja.a1fistWeek.lab12;

/**
 * Created by Serzh on 8/26/16.
 */
public class ArrayUtils2 {

    public static void main(String[] args) {
//        lookFor()
    }

    public static int[] lookFor(int[] array) {
        int[] empty = new int[0];
        int[] current = new int[2];
        int counterOfCurrentLength = 0;
        int counterOfMaxLength = 0;
        int leftIndex = 0;
        int rightIndex = 0;

        if (array.length == 0 || (array.length == 1 && (array[0] <= 0))) {
            return empty;
        } else if (array.length == 1 && (array[0] > 0)) {
            current[0] = leftIndex;
            current[1] = rightIndex;
            return current;
        } else if (array.length > 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    leftIndex = i - counterOfCurrentLength;
                    rightIndex = i;
                    counterOfCurrentLength++;
                    if (counterOfCurrentLength > counterOfMaxLength) {
                        counterOfMaxLength = counterOfCurrentLength;
                        current[0] = leftIndex;
                        current[1] = rightIndex;
                    }
                } else {
                    counterOfCurrentLength = 0;
                    leftIndex = leftIndex + 1;
                }
            }
        }
        return current;
    }
}
