package ua.com.juja.patterns.Strategy.DuckMy;

/**
 * Created by serzh on 12/11/15.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
