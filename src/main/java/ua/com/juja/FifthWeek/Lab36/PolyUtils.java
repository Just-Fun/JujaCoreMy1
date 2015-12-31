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
public class PolyUtils {

    public static void main(String[] args) {

        BigInteger[] x = {new BigInteger("1"),new BigInteger("1")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("1"),new BigInteger("1")};

        mul(x, y);

    }

    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {

        int lenghtX = x.length;
        int lenghtY = y.length;
        int resultLenght = lenghtX + lenghtY - 1;
        BigInteger[] result = new BigInteger[resultLenght];

        result[0] = x[0].multiply(y[0]);
        result[resultLenght - 1] = x[lenghtX - 1].multiply(y[lenghtY - 1]);
        int count = 1;

        if (resultLenght > 2) {
                for (int j = 0; j < lenghtX - 1; j++) {
                    for (int k = 0; k < lenghtY - 1; k++) {
                        result[count] = (x[j].multiply(y[k + 1])).add((x[j + 1]).multiply(y[k]));
                        count++;
                    }
                }
            }
        return result;
    }
}
