package ua.com.juja.oop.My.apartment;

import ua.com.juja.oop.My.equpment.Bucket;
import ua.com.juja.oop.My.equpment.Equipments;
import ua.com.juja.oop.My.equpment.Extinguisher;
import ua.com.juja.oop.My.equpment.Swob;

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
