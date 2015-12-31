package ua.com.juja.FifthWeek.Lab34;

import java.math.BigInteger;

/**
 * Created by serzh on 12/23/15.
 */
public class Bytes {

    public static void main(String[] args) {

      /*  byte b = 2;
        int i = 2;
        System.out.println(Byte.toString(b));
        System.out.println(Integer.toBinaryString(b));*/
        int[] array = {0, 1, 2, 3, 4};
        int[] temp = new int[array.length ];

        System.arraycopy(array, 1, temp, 1, temp.length - 1);
        for (int t : temp) {
            System.out.println(t);
        }

    }
}
