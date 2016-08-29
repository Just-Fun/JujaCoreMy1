package ua.com.juja.a4fourthWeek.Lab28;

/**
 * Created by serzh on 12/17/15.
 */
public class Test3 {
    public static void main(String[] args) {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;

        float testRentTax = 5000;

        float expectedLinerPaymentRentTaxNotDefault = testLinerPassengers * testRentTax;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);

        //check payment if  rent tax is not default
        float actualLinerPaymentRentTaxNotDefault = liner.calculatePayment(testRentTax);
        if (actualLinerPaymentRentTaxNotDefault != expectedLinerPaymentRentTaxNotDefault)
            throw new AssertionError("Rent tax = "+ testRentTax+" and expected payment value= " + expectedLinerPaymentRentTaxNotDefault + " but found " + actualLinerPaymentRentTaxNotDefault);

        System.out.print("OK");

    }
}