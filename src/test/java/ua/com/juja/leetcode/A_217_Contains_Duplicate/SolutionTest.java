package ua.com.juja.leetcode.A_217_Contains_Duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 3/12/16.
 */
public class SolutionTest {

    @Test
    public void testContainsDuplicateFalse() {
        int[] array = {1, 2, 6, 7};
        Solution solution = new Solution();
        assertEquals(false, solution.containsDuplicate(array));
    }

    @Test
    public void testContainsDuplicateTrue() {
        int[] array = {1, 2, 6, 7, 7};
        Solution solution = new Solution();
        assertEquals(true, solution.containsDuplicate(array));
    }
}