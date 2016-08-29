package ua.com.juja.a4fourthWeek.Quiz15;

/**
 * Created by serzh on 12/16/15.
 */
public class OverridingDemo extends Object {
    @Override
    public String toString() {
        String superValue = super.toString();
        return "Super value is " + superValue + " Overrided toString()";
    }

    public static void main(String[] args) {
        Object overridingDemo = new OverridingDemo();
        System.out.println(overridingDemo.toString());

    }
}
