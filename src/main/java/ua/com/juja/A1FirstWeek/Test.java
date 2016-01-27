package ua.com.juja.A1FirstWeek;

/**
 * Created by Oleg on 11/22/2015.
 */
public class Test {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(true, false);

        if (emptyPurchases == null)
            throw new AssertionError("Result cannot be null");

        if (emptyPurchases.equalsIgnoreCase("eggs")) {
            System.out.print("OK");
        } else {
            System.out.print("Fail");
        }
    }
}
