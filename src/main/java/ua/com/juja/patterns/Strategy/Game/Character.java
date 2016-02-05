package ua.com.juja.patterns.Strategy.Game;

/**
 * Created by serzh on 12/28/15.
 */
public abstract class Character {

    WeaponBehavior weapon;

    public void fight() {
        System.out.print(this.getClass().getSimpleName());
        weapon.useWeapon();
    };

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
