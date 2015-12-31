package ua.com.juja.Patterns.Strategy.DuckMy;

/**
 * Created by serzh on 12/11/15.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
