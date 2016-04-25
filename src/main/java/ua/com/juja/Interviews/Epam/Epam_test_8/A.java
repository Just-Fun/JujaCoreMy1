package ua.com.juja.Interviews.Epam.Epam_test_8;

/**
 * Created by serzh on 4/25/16.
 */
public class A {
    public void process() {
        System.out.println("A ");
    }
}
class B extends A {
    public void process() throws RuntimeException {
        super.process();
        if (true) throw new RuntimeException();
        System.out.println("B");
    }
}
class C extends A {
    public void process() {
        super.process();
        System.out.println("C");
    }
}

class D extends B {
    public void process() {
        super.process();
        System.out.println("D");
    }
}

