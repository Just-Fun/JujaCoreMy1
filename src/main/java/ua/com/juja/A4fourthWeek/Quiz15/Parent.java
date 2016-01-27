package ua.com.juja.A4fourthWeek.Quiz15;

/**
 * Created by serzh on 12/16/15.
 */
public abstract class Parent {

    String first() {
        return second();
    }
    abstract String second();
    String third() {
        return "Parent";
    }
}
class Child extends Parent {
    String second() {
        return third();
    }
    String third() {
        return "Child";
    }
}
class Test {
    public static void main(String[] args) {
        System.out.println(new Child().first());
    }
}