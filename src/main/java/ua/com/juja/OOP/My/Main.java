package ua.com.juja.OOP.My;

import ua.com.juja.OOP.My.staff.Housemaid;
import ua.com.juja.OOP.My.staff.RoboCleaner;

/**
 * Created by serzh on 12/13/15.
 */
public class Main {
    public static void main(String[] args) {
        House house = new House(8, 3);
//        SimpleHouse simpleHouse = new SimpleHouse(16, 4);

        Owner owner1 = new Owner("Stiven.Pupkin");
        Owner owner2 = new Owner("Selena.Pupkina");
        Owner owner3 = new Owner("Adam.Pupkina");
        Owner owner4 = new Owner("Flora.Pupkina");
        Owner owner5 = new Owner("Bob.Marley");
        Housemaid housemaid = new Housemaid("Eva.Marley");
        Owner owner6 = new Owner("Bill.Marley");
        Owner owner7 = new Owner("Erika.Marley");
        Owner owner8 = new Owner("MisterX");

        house.addCleaner(housemaid);
        house.addCleaner(new RoboCleaner("nick"));
        house.addCleaner(new RoboCleaner("tick"));
        house.addCleaner(new RoboCleaner("bick"));
        house.addCleaner(new RoboCleaner("aick"));
        house.addCleaner(new RoboCleaner("vick"));
        house.addCleaner(new RoboCleaner("wick"));

        house.settle(owner1);
        house.settle(owner1);
        house.settle(owner3);
        house.settle(owner4);
        house.settle(owner5);
        house.settle(housemaid);
        house.settle(owner6);
        house.settle(owner7);
        house.settle(owner8);

        System.out.println(house.toString());
//        System.out.println(simpleHouse.toString());

    }
}
