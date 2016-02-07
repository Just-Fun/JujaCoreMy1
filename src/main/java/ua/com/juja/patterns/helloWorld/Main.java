package ua.com.juja.patterns.helloWorld;

/**
 * Created by serzh on 2/4/16.
 */
public class Main {

    public static void main(String[] args) {

        String message = "Hello World!";
        Component component = new Runner(new Adapter(ConsoleStrategy.getInstance()));
        component = new ToUpperCaseDecorator(component);
        component = new ReplaceSpaceTo(component, "-");
        component.run(message);
    }

}
