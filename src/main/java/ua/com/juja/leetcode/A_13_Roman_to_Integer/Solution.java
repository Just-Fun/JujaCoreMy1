package ua.com.juja.leetcode.A_13_Roman_to_Integer;

/**
 * Created by serzh on 3/15/16.
 */
public class Solution {
    public static void main(String[] args) {
        int ans = romanToInt("IV");
        System.out.println(ans);
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();

        int ans = 0;
        int temp = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
           int integer = getInteger(chars[i]);
            if (temp > integer) {
                ans -= integer;
            } else {
                ans += integer;
            }
            temp = integer;
        }
        return ans;
    }

    private static int getInteger(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        } else {
            throw new IllegalArgumentException("Wrong number...");
        }
    }
}

//'M' 1000;
//
//'D'= 500;
//'C':100;
//'L': 50;
//'X':= 10;
//'V':= 5;
// 'I':1;
