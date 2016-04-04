package ua.com.juja.Practice.practice1;

/**
 * Created by serzh on 23.02.16.
 */
public class Main {

    public static void main(String[] args) {
        AbstractClass aClass = new AbstractClass() {
        };

        System.out.println(aClass.toString());
        System.out.println(aClass.getClass());
        System.out.println(aClass.i);
    }
}