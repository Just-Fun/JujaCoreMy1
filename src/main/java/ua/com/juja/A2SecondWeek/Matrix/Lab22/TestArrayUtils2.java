package ua.com.juja.A2SecondWeek.Matrix.Lab22;

/**
 * Created by serzh on 12/12/15.
 */
public class TestArrayUtils2 {
    public static void main(String[] args) {
        Object res = ArrayUtilsWithEx.rotateClockwise(new int[0][]);
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}
