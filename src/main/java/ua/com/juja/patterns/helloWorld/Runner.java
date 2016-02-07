package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public class Runner {

    private Strategy strategy;

    public Runner(Target strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.print("Hello World!");
    }
}
