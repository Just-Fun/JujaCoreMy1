package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 07.02.16.
 */
public abstract class Decorator implements Component {
    private Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void run(String message) {
        component.run(message);
    }
}
