package ua.com.juja.leetcode.A_13_Roman_to_Integer;

/**
 * Created by serzh on 3/16/16.
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "XLVI";
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
