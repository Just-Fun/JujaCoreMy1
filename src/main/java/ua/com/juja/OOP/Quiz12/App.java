package ua.com.juja.OOP.Quiz12;

/**
 * Created by serzh on 12/6/15.
 */
public class App {

    public static void main(String[] args) {

        func((ChildA) (Object) new ChildB());
    }

    private static void func(ChildA ref) {
    }

}
