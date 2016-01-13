package ua.com.juja.sevenWeek.quize23;

/**
 * Created by serzh on 1/13/16.
 */
public class Application {

    public static void main(String[] args) throws Throwable {
        try {
            System.err.print("0 ");
            throw new Throwable();
        } catch (Throwable e) {
            System.err.print("1 ");
        }
        System.err.print("2 ");
    }
}
