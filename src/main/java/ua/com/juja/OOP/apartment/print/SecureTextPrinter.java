package ua.com.juja.OOP.apartment.print;

import ua.com.juja.OOP.Owner;
import ua.com.juja.OOP.apartment.LivingApartment;

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
