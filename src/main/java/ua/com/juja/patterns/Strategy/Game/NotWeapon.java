package ua.com.juja.patterns.Strategy.Game;

/**
 * Created by serzh on 2/5/16.
 */
public class NotWeapon implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Don't have any weapon");
    }
}
