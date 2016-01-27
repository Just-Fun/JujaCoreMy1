package ua.com.juja.A5FifthWeek.Lab35;

import java.math.BigInteger;

/**
 * Created by serzh on 12/26/15.
 */
public class BigIntVStepen {

    public static void main(String[] args) {

        BigInteger bigInteger = BigInteger.valueOf(10);
        BigInteger bigInteger1 = BigInteger.valueOf(12);
        BigInteger sum = bigInteger.add(bigInteger1);
        System.out.println(sum);
        /*BigInteger bigIntegerVSt = bigInteger.pow(2);
        System.out.println(bigIntegerVSt);
        */
        BigInteger result = new BigInteger("1");
        BigInteger result1 = new BigInteger("3");
        BigInteger sum1 = result.add(result1);
        System.out.println(sum1);

    }
}
