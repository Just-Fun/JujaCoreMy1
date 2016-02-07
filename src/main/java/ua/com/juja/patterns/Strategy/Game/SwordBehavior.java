package ua.com.juja.patterns.Strategy.Game;

/**
 * Created by serzh on 12/28/15.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public int damage() {
        return 7;
    }

    @Override
    public void useWeapon() {
        System.out.println("use Sword!" + " damage " + this.damage());
    }
}
