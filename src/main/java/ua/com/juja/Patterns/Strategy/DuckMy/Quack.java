package ua.com.juja.Patterns.Strategy.DuckMy;

/**
 * Created by serzh on 12/11/15.
 */
public class Quack implements QuackBehavior {

    public void quack() {
        System.out.println("Quack");
    }
}
