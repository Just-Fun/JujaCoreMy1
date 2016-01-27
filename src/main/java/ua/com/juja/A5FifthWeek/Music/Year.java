package ua.com.juja.A5FifthWeek.Music;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by serzh on 12/27/15.
 */
public class Year {

//    protected static int year;

    public static int getYear() {
        Date localDate = Calendar.getInstance().getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String yearSimple = simpleDateFormat.format(localDate);
        int year = Integer.parseInt(yearSimple);
        return year;
    }
}
