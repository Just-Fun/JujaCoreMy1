package ua.com.juja.FifthWeek.Lab34;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by serzh on 12/23/15.
 */
public class BigIntegerUtils {

   /* public static void main(String[] args) {


        BigInteger k = new BigInteger("128")
                .add(new BigInteger("64"))
                .add(new BigInteger("16"))
                .add(new BigInteger("4"))
                .add(new BigInteger("1"));
        System.out.println(k);
        System.out.println(toBitStr(k));

        BigInteger k0 = new BigInteger("0");
        System.out.println(k0);
        System.out.println(toBitStr(k0));
    }*/

    public static String toBitStr(BigInteger arg) {

//        return arg.toString(2);

//        BigInteger args1 = new BigInteger("5");
        if (arg.equals(new BigInteger("0"))) return "0";
        BigInteger radix = new BigInteger("2");

        BigInteger quotient = null;
        BigInteger remainder = arg;
        String result = "";

        BigInteger divider = new BigInteger("1");

        while (divider.compareTo(arg) <= 0) {
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

        return result;
//        System.out.println(result);

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
