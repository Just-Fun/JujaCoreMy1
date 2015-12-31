package ua.com.juja.FifthWeek.Lab36;

import java.math.BigInteger;

/**
 * Created by serzh on 12/26/15.
 */
public class PrintArray {
    /*public static void main(String[] args) {
        BigInteger[] expected = {new BigInteger("1"), new BigInteger("1"), new BigInteger("0")};

        printA(expected);
    }*/

    public static void printA (BigInteger[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString());
        }
        System.out.println();
    }
}
