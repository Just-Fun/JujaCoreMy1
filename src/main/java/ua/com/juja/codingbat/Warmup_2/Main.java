package ua.com.juja.codingbat.Warmup_2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by serzh on 1/5/16.
 */
public class Main {

    public static void main(String[] args) {
//        stringTimes("Hi", 5);
//        System.out.println(frontTimes("Chocolate", 3));
//        System.out.println(stringSplosion("abc"));
        /*String s = "ab";
        String b = s.substring(1);
        System.out.println(b);*/

        String s = "xxHxix";
        System.out.println(stringX(s));

    }

    public static String stringX(String str) {
        String result = "";
        if (str.length() > 0) result = str.substring(0, 1);

        for (int i = 1; i < str.length() - 1; i++) {
            String letter = str.substring(i, i + 1);
            if (!letter.toLowerCase().equals("x")) {
                result += letter;
            }
        }
        if (str.length() > 1) result += str.substring(str.length() - 1);

        return result;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int size = 0;
        if (a.length() > b.length()) {
            size = b.length();
        } else {
            size = a.length();
        }
        for (int i = 0; i < size - 1; i++) {
            if (charsA[i] == charsB[i] && charsA[i + 1] == charsB[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public boolean array123(int[] nums) {
        boolean a = false;
        boolean b = false;
        boolean c = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) a = true;
            if (nums[i] == 2) b = true;
            if (nums[i] == 3) c = true;
        }
        if (a && b && c) return true;
        return false;
    }

    public boolean arrayFront9(int[] nums) {
        int size = nums.length > 3 ? 4 : nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[i] == 9) return true;

        }
        return false;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }

        }
        return count;
    }

    public static int last2(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        char[] chars = str.toCharArray();
        char a = chars[chars.length - 2];
        char b = chars[chars.length - 1];
        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] == a && chars[i + 1] == b) {
                count++;
            }
        }
        return count;
    }

    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }


    static boolean doubleX(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'x') {
                if (chars[i] == chars[i + 1]) {
                    return true;
                }
                break;
            }

        }
        return false;
    }

    static int countXX(String str) {
        int count = 0;
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'x' && chars[i + 1] == 'x') count++;

        }
        return count;
    }

    public static String stringTimes(String str, int n) {

        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;

        }
        return result;
    }

    public static String frontTimes(String str, int n) {
        if (str.length() > 3) {
            str = str.substring(0, 3);
        }
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;

        }
        return result;
    }

}
