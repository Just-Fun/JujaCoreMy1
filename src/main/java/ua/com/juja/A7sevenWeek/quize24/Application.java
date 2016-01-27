package ua.com.juja.A7sevenWeek.quize24;

/**
 * Created by serzh on 1/13/16.
 */
public class Application {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Error e) {
            // nothing
        }
    }

}
