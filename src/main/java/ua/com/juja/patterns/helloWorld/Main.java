package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public class Main {

    public static void main(String[] args) {


        Strategy strategy = new ConsoleStrategy();
        new Runner(strategy).run();
    }

}
