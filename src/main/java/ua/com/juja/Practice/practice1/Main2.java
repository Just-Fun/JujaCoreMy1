package ua.com.juja.Practice.practice1;

/**
 * Created by serzh on 4/4/16.
 */
public class Main2 {
    public static void main(String[] args) {
        f(1);
    }

    public static void f(int i) {
        if (i < 7) {
            f(2 * i);
        }

        System.out.println(i);
    }
}
