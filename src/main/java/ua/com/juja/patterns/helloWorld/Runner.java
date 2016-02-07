package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public class Runner implements Component {

    private Target target;

    public Runner(Target target) {
        this.target = target;
    }

    @Override
    public void run(String message) {
        target.addMessages(message);
    }
}
