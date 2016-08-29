package ua.com.juja.a4fourthWeek.Lab28;

/**
 * Created by serzh on 12/17/15.
 */
public class Test {
    public static void main(String[] args) {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;

        float expectedLinerPaymentRentTaxDefault = testLinerPassengers * Liner.DEFAULT_RENTAL;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);

        //check payment if rent tax is default
        float actualLinerPaymentRentTaxDefault = liner.calculatePayment();
        if (actualLinerPaymentRentTaxDefault != expectedLinerPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is default" + Liner.DEFAULT_RENTAL + " and expected payment value= " + expectedLinerPaymentRentTaxDefault + " but found " + actualLinerPaymentRentTaxDefault);

        System.out.print("OK");
    }
}
