package ua.com.juja.FifthWeek.Music;

import java.util.Arrays;

import static ua.com.juja.FifthWeek.Music.Notes.getNote;

/**
 * Created by serzh on 12/27/15.
 */
public abstract class StringInstruments extends MusInstrument implements Play, SetStrings {

    protected String[] strings;

    @Override
    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    private String noteToPlay;

    public StringInstruments(int year, int cost) {
        super(year, cost);
    }

    public String[] getStrings() {
        return strings;
    }

    public String getString(int num) {
        return strings[num];
    }

    @Override
    public void playNote(int num) {
        noteToPlay = getNote(num);
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == noteToPlay) {
                System.out.println("Play string #: " + (i + 1) + " '" + strings[i] + "'");
            }
        }
    }

    @Override
    public String toString() {
        return "strings=" + Arrays.toString(strings);
    }

}
