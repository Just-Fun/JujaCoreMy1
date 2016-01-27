package ua.com.juja.A5FifthWeek.Lab36;

import java.math.BigInteger;

/**
 * Created by serzh on 12/26/15.
 */
public class BigEval {

    public static void main(String[] args) {

        BigInteger[] bigIntegers1 = {
                new BigInteger("1"),
                new BigInteger("1"),
        };

        BigInteger[] bigIntegers2 = {
                new BigInteger("1"),
                new BigInteger("1"),
        };
        BigInteger[] bigIntegers3 = {
                new BigInteger("2"),
                new BigInteger("0"),
                new BigInteger("-3"),
                new BigInteger("0"),
        };

        boolean b = bigIntegers1.equals(bigIntegers2);
        boolean b1 = false;

        for (int i = 0; i < bigIntegers1.length; i++) {
            if (bigIntegers1[i].equals(bigIntegers2[i])) {
                b1 = true;
            }
        }
        System.out.println(b1);
    }
}
