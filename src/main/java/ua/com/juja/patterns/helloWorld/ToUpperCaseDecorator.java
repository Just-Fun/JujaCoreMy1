package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 07.02.16.
 */
public class ToUpperCaseDecorator extends Decorator {
    protected ToUpperCaseDecorator(Component component) {
        super(component);
    }

    @Override
    public void run(String message) {
        super.run(message.toUpperCase());
    }
}
