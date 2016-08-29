package ua.com.juja.a4fourthWeek.quiz17.q6;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        App app = new App();
        App.X x = new App.X();
        App.X.Y y = x.new Y();
        y.f();
    }
}
