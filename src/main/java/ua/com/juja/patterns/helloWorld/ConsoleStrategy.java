package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public class ConsoleStrategy implements Strategy {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
