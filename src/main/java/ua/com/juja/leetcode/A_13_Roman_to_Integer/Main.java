package ua.com.juja.leetcode.A_13_Roman_to_Integer;

/**
 * Created by serzh on 3/15/16.
 */
public class Main {
    public static void main(String[] args) {
//        int ans = romanToInt("XL");
        String s = "XL";
        String[] arr = s.split("");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println(ans);
        char[] chars = ans.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
