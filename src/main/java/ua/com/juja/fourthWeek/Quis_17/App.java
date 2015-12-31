package ua.com.juja.fourthWeek.Quis_17;

/**
 * Created by serzh on 12/16/15.
 */
public class App {

    public static void main(String[] args) {
        Outer ref = new Outer();
        Outer.Inner refA = ref.new Inner();
        System.out.println(refA);
    }
}
class Outer {
    class Inner {}
    static class Nested {}
}