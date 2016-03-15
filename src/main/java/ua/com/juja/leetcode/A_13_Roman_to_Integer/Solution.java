package ua.com.juja.leetcode.A_13_Roman_to_Integer;

/**
 * Created by serzh on 3/15/16.
 */
public class Solution {
    public static void main(String[] args) {
        int ans = romanToInt("XLIX");
        System.out.println(ans);
    }

    public static int romanToInt(String s) {
        String[] characters = s.split("");
        String ans = "";
        String temp = "";
        for (int i = characters.length - 1; i >= 0; i--) {
            ans += characters[i];
        }
        char[] chars = ans.toCharArray();
        int integer = 0;
        for (char c : chars) {
            if (c == 'I') {
                integer += 1;
            } else if (c == 'V') {
                integer += 5;
            } else if (c == 'X') {
                integer += 10;
            } else if (c == 'L') {
                integer += 50;
            } else if (c == 'C') {
                integer += 100;
            } else if (c == 'D') {
                integer += 500;
            } else if (c == 'M') {
                integer += 1000;
            }

        }
        return integer;
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
