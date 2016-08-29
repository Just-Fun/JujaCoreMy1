package ua.com.juja.a4fourthWeek.Quiz_16;

/**
 * Created by serzh on 12/16/15.
 */
public abstract class App {

    public abstract void f();

    public static void main(String[] args) {
        g(new Object[16], new App[16]);
    }

    private static void g(Object[] src, App[] dst) {
        for (int k = 0; k < src.length; k++) {
            dst[k] = (App) src[k];
        }
    }
}