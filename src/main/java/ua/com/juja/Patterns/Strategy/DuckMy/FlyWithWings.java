package ua.com.juja.Patterns.Strategy.DuckMy;

/**
 * Created by serzh on 12/11/15.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}
