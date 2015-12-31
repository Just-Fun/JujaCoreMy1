package ua.com.juja.FifthWeek.Music;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by serzh on 12/27/15.
 */
public class Tests {

    public static void main(String[] args) {

        Date localDate = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String yearSimple = simpleDateFormat.format(localDate);
        int year = Integer.parseInt(yearSimple);
        System.out.println(year);
    }
}
