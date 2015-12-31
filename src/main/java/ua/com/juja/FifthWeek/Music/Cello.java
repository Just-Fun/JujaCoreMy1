package ua.com.juja.FifthWeek.Music;

/**
 * Created by serzh on 12/27/15.
 */
public class Cello extends StringInstruments {

    String[] strings = {"C", "G", "D", "A"};



    public Cello(int year, int cost) {
        super(year, cost);
        setStrings(strings);
    }
}
