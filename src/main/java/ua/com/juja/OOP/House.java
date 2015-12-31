package ua.com.juja.OOP;

import ua.com.juja.OOP.apartment.LivingApartment;
import ua.com.juja.OOP.staff.Clener;
import ua.com.juja.OOP.staff.Housemaid;

/**
 * Created by serzh on 12/13/15.
 */
public class House {

    private Floor[] floors;
    private Clener[] cleaners; // TODO А что если убрать во Floor

    public House(int floorsCount, int apartmentsOnFloor) {
       NumberGenerator numbers = new NumberGenerator();

        cleaners = new Clener[floorsCount];

        floors = new Floor[floorsCount];
        for (int index = 0; index < floorsCount; index++) {
            floors[index] = new Floor(index + 1, apartmentsOnFloor, numbers);
        }
    }


    public void settle(Owner owner) {
        System.out.println("Try to settle " + owner.toString() + "\n");
        for (Floor floor : floors) {
            LivingApartment apartment = floor.getFreeApartment();
            if (apartment != null) {
                apartment.addOwner(owner);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String result = "House:\n";
        for (Floor floor : floors) {
            result += floor.toString() + "\n";
        }
        return result;
    }

    public void addCleaner(Clener clener) {
        int floor = nextCleanerPlace();
        this.cleaners[floor] = clener;
        this.floors[floor].setCleaner(clener);
    }

    private int nextCleanerPlace() {
        for (int index = 0; index < cleaners.length; index++) {
            if (cleaners[index] == null) {
                return index;
            }
        }
        throw new RuntimeException("No place for new ceaner");
    }
}
