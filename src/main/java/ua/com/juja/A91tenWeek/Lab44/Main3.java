package ua.com.juja.A91tenWeek.Lab44;

/**
 * Created by serzh on 2/11/16.
 */
public class Main3 {

    public static void main(String[] args) {

        int xW = 1;
        int yW = 2;
        String s = "<point x=" + xW + " y=" + yW + "></point>n";

        char[] chars = s.toCharArray();


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
        System.out.println(x1 + ", " + y1);
    }
}
