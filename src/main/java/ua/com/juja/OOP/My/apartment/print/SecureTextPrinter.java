package ua.com.juja.OOP.My.apartment.print;

import ua.com.juja.OOP.My.apartment.LivingApartment;

/**
 * Created by serzh on 12/18/15.
 */
public class SecureTextPrinter implements Printer {

    @Override
    public String print(LivingApartment livingApartment) {
        String result =  super.toString();
        result += (livingApartment.isFree()) ? "is free" : "is not free\n";
        return result;
    }
}
