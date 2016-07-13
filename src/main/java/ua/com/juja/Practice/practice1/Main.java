package ua.com.juja.Practice.practice1;

/**
 * Created by serzh on 23.02.16.
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass aClass = new AbstractClass() {
        };

        AClass aClass1 = new AClass();

        System.out.println(aClass.toString());
        System.out.println(aClass.getClass().getSimpleName().toString());
        System.out.println(aClass.getClass().getName());
        System.out.println(aClass.i);

        System.out.println(aClass1.toString());
        System.out.println(aClass1.getClass().getSimpleName().toString());
        System.out.println(aClass1.getClass().getName());
    }
}