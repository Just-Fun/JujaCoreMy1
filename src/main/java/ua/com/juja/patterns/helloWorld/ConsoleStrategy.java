package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public final class ConsoleStrategy implements Strategy {
    private static Strategy instance;

    public static Strategy getInstance() {

        return instance = (instance == null ? new ConsoleStrategy() : instance);
    }

    private ConsoleStrategy() {
        //do nothing
    }

    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
