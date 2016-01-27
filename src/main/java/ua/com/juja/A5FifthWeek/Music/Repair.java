package ua.com.juja.A5FifthWeek.Music;

/**
 * Created by serzh on 12/27/15.
 */
public class Repair {

    private static boolean needToRepair = false;

    public static void isNeedToRepair(int yearMaid){
        int now = Year.getYear();
        int howOld = now - yearMaid;
        System.out.println("Instrument is " + howOld + " year old.");
        if (howOld > 10) needToRepair = true;
    }

    public static String checkIfNeedToRepair(int year) {
        isNeedToRepair(year);
        if (needToRepair) {
            System.out.println("needToRepair");
            return "needToRepair";
        }
        System.out.println("don't needToRepair");
        return "don't needToRepair";
    }
}
