package ua.com.juja.FifthWeek.Lab36;

import java.math.BigInteger;

/**
 * Created by serzh on 12/26/15.
 */
public class MakeStringFromArray {

    public static String makeStringFromArray (BigInteger[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += (array[i].toString());
        }
        return result;
    }
}
