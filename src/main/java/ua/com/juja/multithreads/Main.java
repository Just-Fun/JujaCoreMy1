package ua.com.juja.multithreads;

import java.util.Calendar;

/**
 * Created by serzh on 28.02.16.
 */
public class Main {

    public static void main(String[] args) {

        while (true) {
            long time = Calendar.getInstance().getTimeInMillis();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Calendar.getInstance().getTimeInMillis() - time);
        }
    }
}
