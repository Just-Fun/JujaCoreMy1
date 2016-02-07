package ua.com.juja.patterns.Strategy.Game;

/**
 * Created by serzh on 2/5/16.
 */
public class Walk implements WalkBehavior {
    @Override
    public void canWalk() {
        System.out.println(" canWalk");
    }
}
