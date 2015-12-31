package ua.com.juja.OOP;

import ua.com.juja.OOP.apartment.Apartment;
import ua.com.juja.OOP.apartment.LivingApartment;
import ua.com.juja.OOP.apartment.TechnicalApartment;
import ua.com.juja.OOP.apartment.print.SecureTextPrinter;
import ua.com.juja.OOP.staff.Clener;

/**
 * Created by serzh on 12/13/15.
 */
public class Floor {

    private static final int DEFAULT_APARTMENT_CAPACITY = 4;
    private int number;
    private Apartment[] apartments;
    private Clener cleaner;

    public Floor(int number, int apartmentsCount, NumberGenerator numbers) {
        this.number = number;

        this.apartments = new Apartment[apartmentsCount];
        this.apartments[0] = new TechnicalApartment(numbers.getNext());
        for (int index = 1; index < apartmentsCount; index++) {
            apartments[index] = new LivingApartment(numbers.getNext(), DEFAULT_APARTMENT_CAPACITY, new SecureTextPrinter());
        }
    }

    public LivingApartment getFreeApartment() {
        for (Apartment apartment : apartments) {
            if (apartment instanceof LivingApartment && apartment.isFree()) {
                LivingApartment livingApartment = (LivingApartment) apartment;
                if (!livingApartment.isSettled()) {
                    cleaner.clean(apartment);
                }
                return livingApartment;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "==================\n";
        result += "Floor number " + number + "\n";
        result += "--------------------\n";
        for (Apartment apartment : apartments) {
            result += apartment.toString() + "\n";
        }
        result += "==================\n";
        return result;
    }

    public void setCleaner(Clener cleaner) {
        this.cleaner = cleaner;
    }
}
