package ua.com.juja.Interviews.Epam.Epam_test_9;

/**
 * Created by serzh on 4/26/16.
 */
public class Test2 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.sop(); // Parent's static sop, но если сделать метод non-satic, то Child'd static sop
        Child c = new Child();
        c.sop(); // Child'd static sop
    }
}

class Parent {
    /*private Parent() { // заремарим
    }*/

    public static void sop() {
        System.out.println("Parent's static sop");
    }
}

class Child extends Parent { // у Parent privat конструктор, нельзя экстендиться...

    public static void sop() {
        System.out.println("Child'd static sop");
    }
}
