package ua.com.juja.validations;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Serzh on 8/28/16.
 */
public class Time {
    public static void main(String[] args) {
        System.out.println(isToday("2016-08-28"));
    }

    public static boolean isToday(String date) {
        SimpleDateFormat simpleDateFormatOut = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        String today = simpleDateFormatOut.format(new Date());
        return date.contains(today);
    }
}
