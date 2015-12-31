package ua.com.juja.FifthWeek.Music;

import java.util.Date;

/**
 * Created by serzh on 12/27/15.
 */
public abstract class MusInstrument {

    int cost;
    private int year;

    public MusInstrument(int year, int cost) {
        this.year = year;
        this.cost = cost;

    }

    public int getYear() {
        return year;
    }


}
