package ua.com.juja.FifthWeek.Lab33;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by serzh on 12/23/15.
 */
public class Test1 {

    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("2"), new BigInteger("3")};
        BigInteger[] y = {new BigInteger("3"), new BigInteger("6")};
        BigInteger[] expected = {new BigInteger("7"), new BigInteger("6")};
        BigInteger[] actual = FractionUtils.sum(x, y);

        if (!Arrays.equals(expected, actual)) {
            System.out.print("Must be 7 and 6, but " + actual[0] + " and " + actual[1]);
        } else {

            System.out.print("OK");
        }
    }
}
