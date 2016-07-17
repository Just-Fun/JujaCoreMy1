package ua.com.juja.Algoritms.EggsBread;

/**
 * Created by Oleg on 11/22/2015.
 */
public class Test2 {
    public static void main(String[] args) {
        String emptyPurchases = EggsBread.printPurchases(false, true);

        if (emptyPurchases == null)
            throw new AssertionError("Result cannot be null");

        if (emptyPurchases.equalsIgnoreCase("bread")) {
            System.out.print("OK");
        } else {
            System.out.println("Vakh-Vakh...");
        }
    }
}