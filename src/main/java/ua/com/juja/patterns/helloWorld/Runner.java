package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public class Runner {

    private Target target;

    public Runner(Target target) {
        this.target = target;
    }

    public void run() {
        target.addMessages("Hello World!");
    }
}
