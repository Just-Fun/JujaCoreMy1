package ua.com.juja.A5FifthWeek.Lab35;

import java.math.BigInteger;

/**
 * дают полином f = 2*x*x*x - 3*x в виде [2, 0, -3, 0] и точку 100,
 * а мы должны вычислить 2*100*100*100 - 3*100 = 2000000 - 300 = 1999700
 */

public class PolyUtils {
    public static void main(String[] args) {

        /*BigInteger[] bigIntegers = {
                new BigInteger("2"),
                new BigInteger("0"),
                new BigInteger("-3"),
                new BigInteger("0"),
        };*/
//        BigInteger bigInteger = eval(bigIntegers, BigInteger.valueOf(100));

      /*  BigInteger[] poly = {new BigInteger("1")};
        BigInteger arg = new BigInteger("10");
        BigInteger bigInteger = eval(poly, arg);

        System.out.println(bigInteger);*/
        int i = 6;
        System.out.println(Math.pow(6, 0));
    }

    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {

        BigInteger result = new BigInteger("0");

        for (int i = 0; i < poly.length; i++) {
            BigInteger pow = arg.pow(poly.length - 1 - i);
            BigInteger val = poly[i].multiply(pow);
            result = result.add(val);
        }

        return result;
    }
}
