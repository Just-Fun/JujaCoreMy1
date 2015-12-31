package ua.com.juja.OOP.apartment;

import ua.com.juja.OOP.equpment.Bucket;
import ua.com.juja.OOP.equpment.Equipments;
import ua.com.juja.OOP.equpment.Extinguisher;
import ua.com.juja.OOP.equpment.Swob;

import java.util.Arrays;

/**
 * Created by serzh on 12/13/15.
 */
public class TechnicalApartment extends Apartment {

    private Equipments[] equipments;

    public TechnicalApartment(int number) {
        super(number);
        equipments = new Equipments[10];
        equipments[0] = new Extinguisher();
        equipments[1] = new Bucket();
        equipments[2] = new Swob();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "With objects: " + Arrays.toString(equipments);
    }
}
