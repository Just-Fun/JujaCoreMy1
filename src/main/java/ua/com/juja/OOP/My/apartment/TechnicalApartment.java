package ua.com.juja.OOP.My.apartment;

import ua.com.juja.OOP.My.equpment.Bucket;
import ua.com.juja.OOP.My.equpment.Equipments;
import ua.com.juja.OOP.My.equpment.Extinguisher;
import ua.com.juja.OOP.My.equpment.Swob;

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
