package ua.com.juja.FifthWeek.Lab34;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by serzh on 12/23/15.
 */
public class BigIntegerUtils {

    public static void main(String[] args) {


        BigInteger k = new BigInteger("128")
                .add(new BigInteger("64"))
                .add(new BigInteger("16"))
                .add(new BigInteger("4"))
                .add(new BigInteger("1"));
        System.out.println(k);

        System.out.println(toBitStr(k));
    }

    public static String toBitStr(BigInteger arg) {

        BigInteger zero = new BigInteger("0");
        int compare = zero.compareTo(arg);
        if (compare == 0) {
            return "0";
        }


        return arg.toString(2);
    }

}
