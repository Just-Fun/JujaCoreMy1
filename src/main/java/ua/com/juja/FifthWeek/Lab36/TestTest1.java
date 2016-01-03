package ua.com.juja.FifthWeek.Lab36;

import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by serzh on 12/26/15.
 */
public class TestTest1 {


    @Test
    public void test1_1() {

        BigInteger[] x = {
                new BigInteger("1")
        };
        BigInteger[] y = {
                new BigInteger("1")
        };

        BigInteger[] expected = {
                new BigInteger("1")
        };
        assertEquals(x, y, expected);

    }

    @Test
    public void test11_1() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        assertEquals(x, y, expected);

    }

    @Test
    public void test1_11() {

        BigInteger[] x = {
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        assertEquals(x, y, expected);

    }

    @Test
    public void test11_10() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("0"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("0"),
        };
        assertEquals(x, y, expected);

    }

    @Test
    public void test10_0_1__10() {

        BigInteger[] x = {
                new BigInteger("10"),
                new BigInteger("0"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("-1"),
                new BigInteger("0"),
        };

        BigInteger[] expected = {
                new BigInteger("-10"),
                new BigInteger("0"),
                new BigInteger("-1"),
                new BigInteger("0"),
        };
        assertEquals(x, y, expected);

    }


    @Test
    public void test1_2__3_4() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("2"),
        };
        BigInteger[] y = {
                new BigInteger("3"),
                new BigInteger("4"),
        };

        BigInteger[] expected = {
                new BigInteger("3"),
                new BigInteger("10"),
                new BigInteger("8"),
        };

        assertEquals(x, y, expected);
    }


    @Test
    public void test1_1__1_1_1() {

        BigInteger[] x = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] y = {
                new BigInteger("1"),
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] expected = {
                new BigInteger("1"),
                new BigInteger("2"),
                new BigInteger("2"),
                new BigInteger("1"),
        };

        assertEquals(x, y, expected);

    }

    private void assertEquals(BigInteger[] x, BigInteger[] y, BigInteger[] expected) {
        BigInteger[] actual = PolyUtils.mul(x, y);

        String ex = Arrays.toString(expected);
        String act = Arrays.toString(actual);
        assertArrayEquals("expected: " + ex + ", but: " + act, expected, actual);
    }
}