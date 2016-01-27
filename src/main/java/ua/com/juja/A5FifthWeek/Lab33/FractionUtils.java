package ua.com.juja.A5FifthWeek.Lab33;

import java.math.BigInteger;

/**
 * Created by serzh on 12/23/15.
 */
public class FractionUtils {
    public static void main(String[] args) {
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("3")};
        BigInteger[] actual = FractionUtils.sum(x, y);

        System.out.println(actual[0]);
        System.out.println(actual[1]);
    }

    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {

        BigInteger x1 = x[0];
        BigInteger x2 = x[1];
        BigInteger y1 = y[0];
        BigInteger y2 = y[1];

        BigInteger[] result = new BigInteger[2];
        result[0] = (x1.multiply(y2)).add(y1.multiply(x2));
        result[1] = x2.multiply(y2);

        BigInteger greatestCommonDivisor = result[0].gcd(result[1]);

        result[0] = result[0].divide(greatestCommonDivisor);
        result[1] = result[1].divide(greatestCommonDivisor);

        return result;
    }
}
