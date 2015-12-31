package ua.com.juja.fourthWeek.Lab32;

/**
 * Created by serzh on 12/18/15.
 */
public class Test {
    public static void main(String[] args) {

        // check null
        String actualSortedShipStringIfNull = OdessaSeaPort.sortSumPaymentAsc(null);
        if (!((actualSortedShipStringIfNull!=null) && (actualSortedShipStringIfNull.isEmpty())))
            throw new AssertionError("Result cannot be null, expected to be empty string");

        System.out.print("OK");
    }
}
