package ua.com.juja.leetcode.A_220_Contains_Duplicate_III;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 3/14/16.
 */
public class SolutionExample1Test {

    @Test
    public void testContainsNearbyAlmostDuplicate()  {
        int[] array = {1, 2, 3};
        assertEquals(false, new SolutionExample1().containsNearbyAlmostDuplicate(array, 0, 0));
    }

    @Test
    public void testContainsNearbyAlmostDuplicate4() {
        int[] array = {1, 2, 3};
        assertEquals(true, new SolutionExample1().containsNearbyAlmostDuplicate(array, 2, 2));
    }
}