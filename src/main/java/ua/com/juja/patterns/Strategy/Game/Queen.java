package ua.com.juja.patterns.Strategy.Game;

/**
 * Created by serzh on 12/28/15.
 */
public class Queen extends Character {
    public Queen() {
        weapon = new KnifeBehavior();
    }
}
