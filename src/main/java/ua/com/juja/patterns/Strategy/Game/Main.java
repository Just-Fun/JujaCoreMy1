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
        king.display();

        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new SwordBehavior());
        queen.fight();
        queen.walk();
        queen.display();

    }
}
