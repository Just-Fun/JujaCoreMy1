package ua.com.juja.A5FifthWeek.Quiz_19;

/**
 * Created by serzh on 12/23/15.
 */
public class App {

    public static void main(String[] args) {
        int x = 60;
        Holder ref = new Holder(50);
        f(x, ref);
        System.out.print(" " + x + " " + ref.field);
        g(x, ref);
        System.out.print(" " + x + " " + ref.field);
    }
    public static void f(int x, Holder arr) {
        x += 40;
        arr.field = 30;
    }
    public static void g(int x, Holder arr) {
        x = 20;
        arr = new Holder(10);
    }
}
 class Holder {
    public int field;
    public Holder(int field) {
        this.field = field;
    }
}