package ua.com.juja.FifthWeek.Lab34;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by serzh on 12/23/15.
 */
public class Test {

    public static void main(String[] args) {

        BigInteger k = new BigInteger("256")
                .add(new BigInteger("64"))
                .add(new BigInteger("16"))
                .add(new BigInteger("4"))
                .add(new BigInteger("1"));

        String expected = "101010101";
        String actual = BigIntegerUtils.toBitStr(k);

        if (!expected.equals(actual)) {
//            System.out.println(k);
            System.out.print("Must be 101010101, but " + actual);
        } else {

            System.out.print("OK");
        }
    }
}

//  1  0  1 0 1 0101, but 1  1 0 1 0101
//  2561286432168421      1286432168421
