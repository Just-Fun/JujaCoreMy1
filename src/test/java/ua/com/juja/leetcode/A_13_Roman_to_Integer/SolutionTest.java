package ua.com.juja.leetcode.A_13_Roman_to_Integer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 3/16/16.
 */
public class SolutionTest {

    @Test
    public void testRomanToInt() throws Exception {
        assertEquals(4, Solution.romanToInt("IV"));
    }

    @Test
    public void testRomanToInt2() throws Exception {
        assertEquals(80, Solution.romanToInt("LXXX"));
    }

    @Test
    public void testRomanToInt3() throws Exception {
        assertEquals(3999, Solution.romanToInt("MMMCMXCIX"));
    }

    @Test
    public void testRomanToInt4() throws Exception {
        assertEquals(4, Solution.romanToInt("IV"));
    }
}