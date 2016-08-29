package ua.com.juja.interviews.epam.Epam_test_9;

/**
 * Created by serzh on 4/26/16.
 */
//#8
public class X {
    public <X> X(X x) {
        System.out.println("generic constructor");
    }

    public X(X x) {
        System.out.println("simple constructor");
    }

    public X() {
        System.out.println("last");
    }

    public static void main(String args[]) {
        X x = new X(new Integer(5)); // generic constructor
        X x1 = new X(x);             // simple constructor
        X x2 = new X();              // last
    }
}
