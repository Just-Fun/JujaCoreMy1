package ua.com.juja.a4fourthWeek.quiz17;

/**
 * Created by serzh on 12/16/15.
 */
public class App {

    public static void main(String[] args) {
        f(new Runnable() {
            public void run() {
                System.out.println(k);
            }
        });
    }

    public static void f(Runnable ref) {
        final int k = 1;
        ref.run();
    }

    static int k = 0;
}