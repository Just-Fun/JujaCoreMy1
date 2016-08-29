package ua.com.juja.oop.Example;

/**
 * Created by serzh on 17.07.16.
 */
public class Main1 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cello cello = new Cello();
        Object o = cello.clone();
        System.out.println(o.toString());
        cello.getString()[0] = "F";
//        cello.getClass() = "F"; // со строкой так не выйдет :)
        System.out.println(cello.getString()[0]);
        System.out.println(cello.getStringC());

        Instrument cello1 = new Cello();

        Parent ref = new Parent();
//        Child child = (Child) ref; // ClassCastException
//        ChildA ref1 = (ChildA) (Object) new ChildB(); // ClassCastException

    }

    static class Parent {}
    class Child extends Parent {}
    class ChildA extends Parent {}
    static class ChildB extends Parent {}
}
