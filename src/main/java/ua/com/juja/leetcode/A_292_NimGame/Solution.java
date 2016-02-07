package ua.com.juja.leetcode.A_292_NimGame;

/**
 * Created by serzh on 2/4/16.
 */
    // 292
public class Solution {

    public static void main(String[] args) {
//        int test = 138 / 10;
//        addDigits(138);
        System.out.println(addDigits(138));
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    // 258
    public static int addDigits(int num) {
        int temp = 0;
        while (num > 9) {
            while (num > 0) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
            temp = 0;

        }
        return num;
    }
}