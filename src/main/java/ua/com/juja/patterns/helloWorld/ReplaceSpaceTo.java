package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 07.02.16.
 */
public class ReplaceSpaceTo extends Decorator{
    private final String replacemant;

    public ReplaceSpaceTo(Component component, String replacemant) {
        super(component);
        this.replacemant = replacemant;
    }

    @Override
    public void run(String message) {
        super.run(message.replaceAll(" ", replacemant));
    }
}
