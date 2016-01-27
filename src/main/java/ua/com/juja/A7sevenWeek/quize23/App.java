package ua.com.juja.A7sevenWeek.quize23;

/**
 * Created by serzh on 1/13/16.
 */
public class App {

    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        try {
            throw new Error();
        } finally {
            System.err.println(0);
            throw new RuntimeException();
        }
    }

}
