package ua.com.juja.codingbat.Warmup_1;

/**
 * Created by Oleg on 1/6/2016.
 */
public class Main {

    public static void main(String[] args) {

        String a = "f";
        String b = "o";
        String sum = a + b;
        String sum1 = a.concat(b);
        String в = sum.charAt(0) + "";
//        System.out.println(sum1);
        System.out.println(everyNth("Miracle", 2));
    }

    public static String everyNth(String str, int n) {
        String result = str.substring(0, 1);
        for (int i = n; i < str.length() ; i += n) {
            result += str.charAt(i);
        }
        return result;
    }


    public String endUp(String str) {
        int size = str.length();
        if (size == 0) return str;
        if (size < 4) return str.toUpperCase();
        return str.substring(0, size - 3).concat(str.substring(size - 3).toUpperCase());
    }


    public boolean lastDigit(int a, int b) {

        for (int i = 0; a > 9; i++) {
            a = a % 10;
        }

        for (int i = 0; b > 9; i++) {
            b = b % 10;
        }

        if (a == b) return true;
        return false;
    }


    public boolean stringE(String str) {

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'e') count++;
        }
        if (count > 0 && count < 4) return true;
        return false;
    }


    public int max1020(int a, int b) {

        if (!(a > 9 && a < 21)) a = 0;
        if (!(b > 9 && b < 21)) b = 0;
        if (a > 0 && a > b) {
            return a;
        } else if (b > 0 && b > a) {
            return b;
        } else {
            return 0;
        }
    }


    public boolean in3050(int a, int b) {
        if ((a > 29 && a < 41 && b > 29 && b < 41) || (a > 39 && a < 51 && b > 39 && b < 51)) {
            return true;
        } else {
            return false;
        }
    }


    public int close10(int a, int b) {

        int a1 = Math.abs(10 - a);
        int b1 = Math.abs(10 - b);
        if (a1 == b1) return 0;
        if (a1 < b1) {
            return a;
        } else {
            return b;
        }
    }

    public int intMax(int a, int b, int c) {
        int max = Math.max(a, b);
        return Math.max(max, c);
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() < 1) return result;
        if (str.length() > 0) {
            if (str.substring(0, 1).equals("o") || str.substring(0, 1).equals("o")) {
                result += str.substring(0, 1);
            }
        }
        if (str.length() > 1) {
            if (str.substring(1, 2).equals("z") || str.substring(1, 2).equals("z")) {
                result += str.substring(1, 2);
            }
        }
        return result;
    }


    public boolean mixStart(String str) {

        if (str.length() < 3) return false;
        return (str.substring(1, 3).equals("ix"));
    }


    public String delDel(String str) {
        String del = "del";
        if (str.length() < 4) {
            return str;
        } else if (str.length() == 4 && str.substring(1, 4).equals(del)) {
            return str.substring(0, 1);
        } else if (str.substring(1, 4).equals(del)) {
            return str.substring(0, 1).concat(str.substring(4));
        } else {
            return str;
        }
    }


    public boolean loneTeen(int a, int b) {
        return ((a > 12 && a < 20) && !(b > 12 && b < 20)) || (!(a > 12 && a < 20) && (b > 12 && b < 20));
    }


    public boolean hasTeen(int a, int b, int c) {
        return ((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20));
    }


    public boolean in1020(int a, int b) {

        return ((10 > a && a < 20) || (10 > b && b < 20));
    }


    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100));
    }


    public boolean startHi(String str) {
        return (str.length() > 1 && str.substring(0, 2).equals("hi"));
    }


    public String front22(String str) {
        String add = "";
        if (str.length() < 2) {
            add = str;
        } else {
            add = str.substring(0, 2);
        }

        return add + str + add;
    }

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }


    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;

    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str + str + str;
        } else {
            return str.substring(0, 3).concat(str.substring(0, 3)).concat(str.substring(0, 3));
        }
    }

    public String frontBack(String str) {

        return str.length() < 2 ? str : str.substring(str.length() - 1, str.length()).concat(str.substring(1, str.length() - 1)).concat(str.substring(0, 1));
    }


    public String missingChar(String str, int n) {

        return str.substring(0, n).concat(str.substring(n + 1));
    }

    public String notString(String str) {

        String s = "not";
        if (str.length() > 2 && str.substring(0, 3).equals(s)) {
            return str;
        } else {
            return s.concat(" ").concat(str);
        }
    }


    public boolean posNeg(int a, int b, boolean negative) {

        if ((!negative && ((a < 0 && b > 0) || (a > 0 && b < 0))) || (negative && (a < 0 && b < 0))) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {

        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);
    }


    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || (a + b) == 10);
    }

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour > 20)) {
            return true;
        }
        return false;
    }


    public int diff21(int n) {

        if (n <= 21) {
            return 21 - n;
        }
        return (n - 21) * 2;
    }

    public int sumDouble(int a, int b) {

        if (a == b) {
            return (a + b) * 2;
        } else {
            return a + b;

        }
    }


    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;
    }

}
