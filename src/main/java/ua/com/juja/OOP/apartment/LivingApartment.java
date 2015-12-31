package ua.com.juja.OOP.apartment;

import ua.com.juja.OOP.Owner;
import ua.com.juja.OOP.apartment.print.Printer;

/**
 * Created by serzh on 12/13/15.
 */
public class LivingApartment extends Apartment {

    //private int number;
    private Owner[] owners;
    private Printer printer;
    private String[] result;

    public LivingApartment(int number, int capacity, Printer printer) {
        super(number);
        this.owners = new Owner[capacity];
        this.printer = printer;
    }

    public void addOwner(Owner owner) {
        owners[getFreeRoomindex()] = owner;
    }

    @Override
    public String toString() {
        String result = printer.print(this);
        return result;
    }



    private int getFreeRoomindex() {
        for (int index = 0; index < owners.length; index++) {
            if (owners[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("No free rooms for owner!!!");
    }

    public boolean isFree() {
        return owners[owners.length - 1] == null;
    }

    public boolean isSettled() {
        return owners[0] != null;
    }

    public String[] getOwners() {
        String[] result = new String[owners.length];
        for (int index = 0; index < result.length; index++) {
            if (owners[index] != null) {
                result[index] = owners[index].toString();
            } else {
                result[index] = "";
            }
        }
        return result;
    }
}
