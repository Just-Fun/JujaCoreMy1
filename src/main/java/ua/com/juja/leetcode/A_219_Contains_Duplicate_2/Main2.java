package ua.com.juja.leetcode.A_219_Contains_Duplicate_2;

import java.util.Calendar;

/**
 * Created by serzh on 3/12/16.
 */
public class Main2 {
    public static void main(String[] args) {

        String s = "1";
        int i = Integer.parseUnsignedInt(s);
        System.out.println(i);

        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long start = System.currentTimeMillis( );
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
        long end = System.currentTimeMillis( );
        long d = timeInMillis2 - timeInMillis;
        long diff = end - start;
        System.out.println(diff);
        System.out.println("d" + d);
    }
}
