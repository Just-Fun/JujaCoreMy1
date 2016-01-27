package ua.com.juja.A5FifthWeek.Lab34;

import java.math.BigInteger;

/**
 * Created by serzh on 1/25/16.
 */
public class Main {

    public static void main(String[] args) {


        BigInteger args1 = new BigInteger("0");


        BigInteger radix = new BigInteger("2");

        BigInteger quotient = null;
        BigInteger remainder = args1;
        String result = "";

        BigInteger divider = new BigInteger("1");

        while (divider.compareTo(args1) <= 0) {
            divider = divider.multiply(radix);
        }
        divider = divider.divide(radix);

        do {
            BigInteger[] divResult = remainder.divideAndRemainder(divider);
            quotient = divResult[0];
            remainder = divResult[1];

            result += quotient;

            divider = divider.divide(radix);
        } while (divider.compareTo(new BigInteger("0")) > 0);


        System.out.println(result);

        /*BigInteger args1 = new BigInteger("5");
        BigInteger radix = new BigInteger("2");

        BigInteger quotient = args1;
        BigInteger remainder = null;
        String result = "";

        do {
            BigInteger[] divResult = quotient.divideAndRemainder(radix);
            quotient = divResult[0];
            remainder = divResult[1];
            result = remainder + result;
        } while (quotient.compareTo(new BigInteger("0")) > 0);

        System.out.println(result);*/


    }
}
