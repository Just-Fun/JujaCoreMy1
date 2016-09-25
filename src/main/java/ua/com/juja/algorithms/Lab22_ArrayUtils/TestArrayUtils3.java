package ua.com.juja.algorithms.Lab22_ArrayUtils;

/**
 * Created by serzh on 12/12/15.
 */
public class TestArrayUtils3 {
    public static void main(String[] args) {
        Object res = ArrayUtilsWithEx.rotateClockwise(new int[][] {null});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
