package ua.com.juja.a4fourthWeek.Quize14;

/**
 * Created by serzh on 12/15/15.
 */
public class App {
    public static int a;
    public int b;
    public int c;

    public App() {
        a++;
        b++;
        c = a + b;
    }
    public static void main(String[] args) {
        App app0 = new App();
        System.out.println(app0.a);
        App app1 = new App();
        System.out.println(app1.b);
        App app2 = new App();
        System.out.println(app2.c);
    }
}
