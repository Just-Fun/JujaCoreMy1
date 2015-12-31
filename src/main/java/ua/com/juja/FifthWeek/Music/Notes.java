package ua.com.juja.FifthWeek.Music;

/**
 * Created by serzh on 12/27/15.
 */
public class Notes {

    public static final String[] notes = {"C", "D", "E", "F", "G", "A", "H"};

    public static String getNote(int num) {
        return notes[num - 1];
    }
}
