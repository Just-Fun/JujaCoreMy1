package ua.com.juja.Practice.practice1;

/**
 * Created by serzh on 23.02.16.
 */
public abstract class AbstractClass {

    int i = 9;

    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
        };
        int result = abstractClass.i;

        System.out.println(result);
    }

    public AbstractClass() {

    }
}
