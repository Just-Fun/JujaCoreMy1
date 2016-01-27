package ua.com.juja.A5FifthWeek.lab34;

import org.junit.Test;
import ua.com.juja.A5FifthWeek.Lab34.BigIntegerUtils;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 21.01.2016.
 */
public class BigIntegerUtilsTest {

    @Test
    public void test() {
        assertEquals("11000000100011",
                BigIntegerUtils.toBitStr(new BigInteger("12323")));
        assertEquals("1010101011000",
                BigIntegerUtils.toBitStr(new BigInteger("5464")));
        assertEquals("10100011110001110000101100110",
                BigIntegerUtils.toBitStr(new BigInteger("343466342")));
        assertEquals("1101010010000110101",
                BigIntegerUtils.toBitStr(new BigInteger("435253")));
        assertEquals("10",
                BigIntegerUtils.toBitStr(new BigInteger("2")));

        // home work
        assertEquals("1",
                BigIntegerUtils.toBitStr(new BigInteger("1")));
        assertEquals("0",
                BigIntegerUtils.toBitStr(new BigInteger("0")));
    }
}
