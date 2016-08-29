package ua.com.juja.a4fourthWeek.quiz17.q6;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class App {
    static int k;

    static class X {
        // static int p; // Illegal static declaration in inner class ua.com.juja.quiz17.q6.App.X modifier 'static' is only allowed in constant variable declarations
        int p;

        class Y {
            public void f() {
                System.out.println(k);
                System.out.println(p);
            }
        }
    }
}
