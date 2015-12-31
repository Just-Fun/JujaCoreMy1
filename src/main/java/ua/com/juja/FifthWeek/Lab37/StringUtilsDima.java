package ua.com.juja.FifthWeek.Lab37;

import static java.lang.Math.abs;

/**
 * Created by serzh on 12/24/15.
 */
//("ABCDE", -1) = "BCDEA", ("ABCDE", -2) = "CDEAB", ("ABCDE", -7) = "CDEAB"

public class StringUtilsDima {

    public static void main(String[] args) {

        System.out.println(rightShift("ABCDE", 10));
    }

        public static String rightShift(String arg, int delta) {
            if (arg.equals(""))return "";
            String s=arg;
            if (delta > 0){
                for (int i = 0; i < delta; i++) {
                    s=s.substring(s.length()-1,s.length())+s.substring(0,s.length()-1);
                }
            }else if (delta<0){
                for (int i = 0; i < -delta; i++) {
                    s=s.substring(1,s.length())+s.substring(0,1);
                }
            }
            return s;
        }
    }
