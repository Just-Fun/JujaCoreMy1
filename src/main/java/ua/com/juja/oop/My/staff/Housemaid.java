package ua.com.juja.oop.My.staff;

import ua.com.juja.oop.My.Owner;
import ua.com.juja.oop.My.apartment.Apartment;

/**
 * Created by serzh on 12/18/15.
 */
public class Housemaid extends Owner implements Clener {

    public Housemaid(String name) {
        super(name);
    }

    public void clean(Apartment apartment) {
        System.out.println("Cleaning apartment " + apartment.getNumber());
        System.out.println("Cleaning done by " + name);
    }
}
