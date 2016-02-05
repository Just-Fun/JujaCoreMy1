package ua.com.juja.patterns.Singleton;

/**
 * Created by serzh on 2/5/16.
 */
public class TestHarness {
    public static void main(String[] args) {
        NormalObject object1 = new NormalObject();
        NormalObject object3 = new NormalObject();
        System.out.println(object1/*.getClass()/*.getSimpleName()*/);
        System.out.println(object3/*.getClass()/*.getSimpleName()*/);

        SingletonObject object = SingletonObject.getInstance();
        System.out.println(object/*.getClass()/*.getSimpleName()*/);
        SingletonObject object2 = SingletonObject.getInstance();
        System.out.println(object2/*.getClass()/*.getSimpleName()*/);

    }

}
