package ua.com.juja.patterns.Strategy.Game;

/**
 * Created by serzh on 12/28/15.
 */
public class Main {

    public static void main(String[] args) {

        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();

    }
}
