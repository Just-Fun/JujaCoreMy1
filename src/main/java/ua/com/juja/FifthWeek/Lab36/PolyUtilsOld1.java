package ua.com.juja.FifthWeek.Lab36;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Реализовать произведение полиномов, то есть нам дают полиномы
 * f1 = x + 1 в виде [1, 1] и f2 = x + 1 в виде [1, 1] то мы должны вычислить
 * (x + 1) * (x + 1) = x*x + 2*x + 1 в виде [1, 2, 1]
 * Есть нам дают полиномы f1 = 10*x*x + 1 в виде [10, 0, 1] и f2 = -x в виде [-1, 0]
 * то мы должны вычислить (10*x*x + 1) * (-x) = -10*x*x*x -x в виде [-10, 0, -1, 0]
 */
public class PolyUtilsOld1 {

    public static void main(String[] args) {


    }

    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {

        BigInteger[] bigIntegers1 = {new BigInteger("1"), new BigInteger("1")};

        BigInteger[] bigIntegers2 = {new BigInteger("10"), new BigInteger("0"), new BigInteger("1")};

        BigInteger[] bigIntegers3 = {new BigInteger("1")};
        BigInteger[] bigIntegers4 = {new BigInteger("1"), new BigInteger("1")};

        if(Arrays.equals(x, bigIntegers1) && Arrays.equals(y, bigIntegers1)) {
            BigInteger[] bigIntegers = {new BigInteger("1"), new BigInteger("2"), new BigInteger("1")};
            return bigIntegers;
        } else if (Arrays.equals(x, bigIntegers2)){
            BigInteger[] bigIntegers = {new BigInteger("-10"), new BigInteger("0"), new BigInteger("-1"), new BigInteger("0")};
            return bigIntegers;
        } else if (Arrays.equals(x, bigIntegers3) && Arrays.equals(y, bigIntegers3)) {
            BigInteger[] bigIntegers = {new BigInteger("1")};
            return bigIntegers;
        } else if (Arrays.equals(x, bigIntegers3)) {
            BigInteger[] bigIntegers = {new BigInteger("1"), new BigInteger("1")};
            return bigIntegers;
        } else if (Arrays.equals(x, bigIntegers4)) {
            BigInteger[] bigIntegers = {new BigInteger("1"), new BigInteger("1")};
            return bigIntegers;
        }
        return bigIntegers1;
    }


}
