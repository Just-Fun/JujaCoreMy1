package ua.com.juja.leetcode.A_202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by serzh on 4/5/16.
 */
public class Solution {

    public static void main(String[] args) {
        boolean b = isHappy(20);
        System.out.println(b);
    }

    public static boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (set.add(n)) {
            n = getN(n);
        }
        if (n == 1) {
            return true;
        }

        return false;
    }

    private static int getN(int n) {
        int size = String.valueOf(n).length();
        int temp = 0;

        for (int i = 0; i < size; i++) {
            int last = n % 10;
            temp += last * last;
            n = n / 10;
        }
        return temp;
    }
}
