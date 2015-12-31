package ua.com.juja.fourthWeek.Quize14;

/**
 * Created by serzh on 12/15/15.
 */
public class App {
    public static int a = 0;
    public int b = 0;

    public App() {
        this.b = a++;
    }
    public static int get() {
        return a++ + a++;
    }
    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
    }
}
