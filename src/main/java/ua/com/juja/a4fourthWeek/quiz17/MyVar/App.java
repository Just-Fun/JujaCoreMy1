package ua.com.juja.a4fourthWeek.quiz17.MyVar;

/**
 * Created by serzh on 12/30/15.
 */
public class App {
    public static void main(String[] args) {
        Outer11.Inner ref = new Outer11().new Inner();
    }
}
class Outer11 {
    class Inner {}
    static class Nested {}
}
