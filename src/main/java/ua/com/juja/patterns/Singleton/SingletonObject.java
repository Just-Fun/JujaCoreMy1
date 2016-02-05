package ua.com.juja.patterns.Singleton;

/**
 * Created by serzh on 2/5/16.
 */
public class SingletonObject {
    private static SingletonObject object;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (object == null) {
            object = new SingletonObject();
        }
        return object;
    }
}
