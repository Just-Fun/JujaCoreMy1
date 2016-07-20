package ua.com.juja.Practice;

import ua.com.juja.OOP.Example.Cello;

/**
 * Created by serzh on 17.07.16.
 */
public class Main {

    public static void main(String[] args) {




        /*Cello cello = new Cello();
        cello.getString()[0] = "F";
        System.out.println(cello.getString()[0]);*/

        String s1 = " 6 2 6 ";
        System.out.println(s1.trim());

        String s = reverseByArray("1\2\3^5\4>6<7");
        System.out.println(s);

        String s2 = "RT ";
        System.out.println(reverseByArray(s2.trim()));
//        String s3 = s2.trim();
        String s3 = reverseByArray(s2.trim());
        System.out.println(s3);

        String a = "123456789";
        String b = new StringBuffer(a).reverse().toString();
        System.out.println(b);

    }

    public static String reverseByArray(String s) {
        /*StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();*/


        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }

    private static int sumLambda(int... num) {
        int result = 0;
        return result;
    }

    private static int sum(int... num) {
        int result = 0;
        for (int i : num) {
            result += i;
        }
        return result;
    }


}
