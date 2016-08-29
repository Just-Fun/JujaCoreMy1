package ua.com.juja.bitOperations;

/**
 * Created by serzh on 17.07.16.
 */
/*Реализуйте метод swapBits(b, i, j), который производит "рокировку" битов с номерами i и j,
то есть swapBits(0b1111_0000, 0, 6) = 0b1011_0001 swapBits(0b0000_1000, 3, 1) = 0b0000_0010*/
public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        int bit1 = (b >> i) & 1;// bit at i
        int bit2 = (b >> j) & 1;// bit at j
        if (bit1 == bit2) {
            return b; //// no need to swap since we change 1 with 1 or 0 with 0
        } else {
            int mask = (1 << i) | (1 << j);
            return (byte) (b ^ mask);
        }
    }
}
