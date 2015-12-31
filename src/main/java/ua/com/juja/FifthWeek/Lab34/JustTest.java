package ua.com.juja.FifthWeek.Lab34;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by serzh on 12/24/15.
 */
public class JustTest {

    public static void main(String[] args) {

        /*BigInteger bigInteger = new BigInteger("0");
        System.out.println(toBitStr(bigInteger));*/ // 11_010_101, 111_010_101, 1_011_010_101
      /*  BigInteger k = new BigInteger("256");
        System.out.println(k);

        byte[] array = k.toByteArray();

        String result = "";
        for (byte b : array) {
            result += Integer.toBinaryString(b);
        }
        System.out.println(result);
        System.out.println(k.toString(2));*/

        int i = 2;
        Integer integer = new Integer(i);
        String s = new String("OK").intern();
        System.out.println(integer);
        System.out.println(integer.toString(3));

    }
}
