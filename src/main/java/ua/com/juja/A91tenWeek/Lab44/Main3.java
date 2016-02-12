package ua.com.juja.A91tenWeek.Lab44;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serzh on 2/11/16.
 */
public class Main3 {

    public static void main(String[] args) {

        int xW = 1;
        int yW = 2;
        String string = ("<point x=" + xW + " y=" + yW + "></point>n");


//        String expressionPointX = "(<point x=)(\\w*)(\\W*y=)(\\w*)(></point>n)";
//        String expressionPointY = "(<point x=)(\\w*)(\\W*y=)(\\w*)(></point>n)";
        String expressionPointX = "(\\D+)(\\d+)(\\D+)(\\d+)(\\D+)";
        String expressionPointY = "(\\D+)(\\d+)(\\D+)(\\d+)(\\D+)";

        int i1 = Integer.valueOf(parseString(string, expressionPointX, 2));
        int i2 = Integer.valueOf(parseString(string, expressionPointY, 4));
        System.out.println(i1 + ", " + i2);
    }

    private static String parseString(String string, String expression, int numberGroup) {
        String result = "";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher(string);
        if (m.find()) {
            result = m.group(numberGroup);
        }
        return result;
    }

//        String s1 = s.replaceAll("\\D", "");
//        System.out.println(s1);

      /*  char[] chars = s.toCharArray();


        String x = "";
        String y = "";
        int countEq = 0;
        int countSpace = 0;
        boolean rightUgol = false;
        //<point x=1 y=2></point>n
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                countSpace++;
            }
            if (chars[i] == '>') {
                rightUgol = true;
            }
            if (countEq > 0 && countSpace < 2) {
                x += Character.toString(chars[i]);
            }
            if (countEq > 1 && !rightUgol) {
                y += Character.toString(chars[i]);
            }
            if (chars[i] == '=') {
                countEq++;
            }
        }

        int x1 = Integer.valueOf(x);
        int y1 = Integer.valueOf(y);
        System.out.println(x1 + ", " + y1);*/
}
