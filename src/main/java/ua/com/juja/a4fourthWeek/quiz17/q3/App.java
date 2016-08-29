package ua.com.juja.a4fourthWeek.quiz17.q3;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class App {
    public static void main(String[] args) {
        final int k = 0;
        f(new Runnable() {
            public void run() {
                System.out.println(k);
            }
        });
    }

    public static void f(Runnable ref) {
        final int k = 1;
        ref.run();
        final int k2 = 1;
    }
}