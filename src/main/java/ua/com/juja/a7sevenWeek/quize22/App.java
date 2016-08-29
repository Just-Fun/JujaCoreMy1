package ua.com.juja.a7sevenWeek.quize22;

/**
 * Created by serzh on 1/13/16.
 */
public class App {

    public static void main(String[] args) {

        System.err.println("f:before");
        try {
            f();
        } catch (Error e){
            System.err.println("f:catch");
        }
        System.err.println("f:after");
    }

    public static void f() {
        System.err.println("g:before");
        try {
            g();
        } finally {
            System.err.println("g:finally");
        }
        System.err.println("g:after");
    }

    public static void g() {
        throw new Error();
    }
}

