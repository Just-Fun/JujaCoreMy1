package ua.com.juja.A5FifthWeek.Lab36;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by serzh on 12/26/15.
 */
public class Test2 {

    public static void main(String[] args) {
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
        BigInteger[] actual = PolyUtilsOld1.mul(x, y);

        if (!Arrays.equals(actual, expected)) {
            System.out.println("expected: ");
            PrintArray.printA(expected);
            System.out.println("but : ");
            PrintArray.printA(actual);
        } else {
            System.out.print("OK");
        }
    }
}
