package ua.com.juja.Patterns.Strategy.Game;

/**
 * Created by serzh on 12/28/15.
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe!");
    }
}
