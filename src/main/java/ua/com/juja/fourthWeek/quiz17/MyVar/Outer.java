package ua.com.juja.fourthWeek.quiz17.MyVar;

/**
 * Created by serzh on 12/30/15.
 */
public class Outer {

    void outerMethod() {
        final int x = 98;
        System.out.println("inside outerMethod");
        class Inner {
            void innerMethod() {
                System.out.println("x= " + x);
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}


class MethodLocalVariableDemo {
    public static void main(String[] args) {
        Outer x = new Outer();
        x.outerMethod();
    }
}
