package ua.com.juja.FifthWeek.mirror;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by serzh on 12/31/15.
 */
public class MirrorTest {

    @Test
    public void testUpDown_whenSizeIs0() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[0][0];

        //when
        mirror.UpDown(array);

        //then
        assertEquals("", toString(array));

    }

    @Test
    public void testUpDown_whenSizeIs1() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[1][1];
        array[0][0] = 13;

        //when
        mirror.UpDown(array);

        //then
        assertEquals("13\n", toString(array));

    }

    @Test
    public void testUpDown_whenSizeIs2() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[2][2];

        // 12
        // 34
        array[0][0] = 1;
        array[1][0] = 3;
        array[0][1] = 2;
        array[1][1] = 4;

        assertEquals(
                "12\n" +
                        "34\n", toString(array));

        //when
        mirror.UpDown(array);

        //then
        assertEquals("34\n" +
                "12\n", toString(array));

    }

    @Test
    public void testUpDown_whenSizeIs3() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[3][3];

        // 12
        // 34
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};

        assertEquals(
                "123\n" +
                        "456\n"+
                        "789\n", toString(array));

        //when
        mirror.UpDown(array);

        //then
        assertEquals(
                "789\n"+
                        "456\n"+
                        "123\n", toString(array));

    }

    @Test
    public void testUpDown_whenSizeIs4() {
        // given
        Mirror mirror = new Mirror();
        int[][] array = new int[4][4];

        int size = array.length;
        int num = 1;
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                array[y][x] = num++;
            }
        }

        assertEquals(
                "1234\n" +
                        "5678\n" +
                        "9101112\n" +
                        "13141516\n", toString(array));

        //when
        mirror.UpDown(array);

        //then
        assertEquals(
                "13141516\n" +
                        "9101112\n" +
                        "5678\n" +
                        "1234\n", toString(array));

    }

    private String toString(int[][] array) {
        String result = "";

        int size = array.length;

        for (int y = 0; y < size; y++) {
            int[] row = array[y];
            if (row.length != size) {
                fail("Массив не квадратный");
            }
            for (int x = 0; x < size; x++) {
                result += array[y][x];
            }
            result += "\n";
        }
        return result;
    }
}
