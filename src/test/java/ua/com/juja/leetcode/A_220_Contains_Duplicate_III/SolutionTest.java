package ua.com.juja.leetcode.A_220_Contains_Duplicate_III;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 3/14/16.
 */
public class SolutionTest {

    @Test
    public void testContainsNearbyAlmostDuplicate() {
        int[] array = {1, 2, 3};
        assertEquals(false, new Solution().containsNearbyAlmostDuplicate(array, 0, 0));
    }

    @Test
    public void testContainsNearbyAlmostDuplicate1() {
        int[] array = {1, 2, 3};
        assertEquals(false, new Solution().containsNearbyAlmostDuplicate(array, 1, 0));
    }

    @Test
    public void testContainsNearbyAlmostDuplicate2() {
        int[] array = {1, 2, 3};
        assertEquals(false, new Solution().containsNearbyAlmostDuplicate(array, 0, 1));
    }

    @Test
    public void testContainsNearbyAlmostDuplicate3() {
        int[] array = {1, 2, 3, 4};
        assertEquals(false, new Solution().containsNearbyAlmostDuplicate(array, 1, 1));
    }

    @Test
    public void testContainsNearbyAlmostDuplicate4() {
        int[] array = {1, 2, 3};
        assertEquals(true, new Solution().containsNearbyAlmostDuplicate(array, 2, 2));
    }
}