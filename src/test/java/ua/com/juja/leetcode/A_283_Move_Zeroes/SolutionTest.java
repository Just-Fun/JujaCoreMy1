package ua.com.juja.leetcode.A_283_Move_Zeroes;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by serzh on 3/14/16.
 */
public class SolutionTest {

    @Test
    public void testMoveZeroes() {
        SolutionExample1 solution = new SolutionExample1();
        int[] array = {0, 1, 0, 3, 12};
        solution.moveZeroes(array);

        assertEquals(Arrays.toString(new int[]{1, 3, 12, 0, 0}), Arrays.toString(array));
    }
}