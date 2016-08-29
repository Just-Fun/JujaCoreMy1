package ua.com.juja.a4fourthWeek.quiz17.q5;

/**
 * Created by oleksandr.baglai on 29.12.2015.
 */
public class App {

    public void main(String[] args) {
        f(new Runnable() {
            public void run() {
                System.out.println(k);
            }
        });
    }

    public void f(Runnable ref) {
        final int k = 1;
        if (true) {
            int k2 = 2;
            System.out.println(k);
        }
        ref.run();
    }

    int k = 0;
}