package ua.com.juja.OOP;

/**
 * Created by serzh on 12/13/15.
 */
public class Owner {

    protected final String name;

    public Owner(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner: " + name;
    }
}
