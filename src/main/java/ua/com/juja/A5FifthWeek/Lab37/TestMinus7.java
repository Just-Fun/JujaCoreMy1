
package ua.com.juja.A5FifthWeek.Lab37;

import java.util.Date;

/**
 * Created by serzh on 12/24/15.
 */
//("ABCDE", -7) = "CDEAB"

public class TestMinus7 {

    public static void main(String[] args) {

        Date date = new Date();
        String test = "ABCDE";
        int i = -6000007;

        String expected = "CDEAB";
        String actual = StringUtils.rightShift(test, i);
        Date date2 = new Date();
        long diff = date2.getTime() - date.getTime();

        System.out.println(diff);
        if (!expected.equals(actual)) {
            System.out.print("Must be " + expected + " , but " + actual);
        } else {

            System.out.print("-7 OK");
        }
    }
}

