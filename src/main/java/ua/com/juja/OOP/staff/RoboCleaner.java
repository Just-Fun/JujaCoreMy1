package ua.com.juja.OOP.staff;

import ua.com.juja.OOP.apartment.Apartment;

/**
 * Created by serzh on 12/18/15.
 */
public class RoboCleaner implements Clener {

    private String nick;

    public RoboCleaner(String nick) {
        this.nick = nick;
    }

    public void clean(Apartment apartment) {
        System.out.println("RoBoBoBo " + nick + " Cleaning...");
        System.out.println("Done!");
    }
}
