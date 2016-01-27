package ua.com.juja.A5FifthWeek.Music;

/**
 * Created by serzh on 12/27/15.
 */
public class Main {

    public static void main(String[] args) {

        StringInstruments cello = new Cello(1897, 2000);

        cello.playNote(1);

       Repair.checkIfNeedToRepair(cello.getYear());


    }
}
