package ua.com.juja.interviews.epam.Epam_test_6;

/**
 * Created by serzh on 4/19/16.
 */
//№10
public class Test {
    static {
        System.out.println("Bo-Bo!");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    static {
        System.out.println("Go-Go!");
        System.exit(0);
        /*
        public static void exit(int status) {
        Runtime.getRuntime().exit(status);
    }
        //Terminates the currently running Java Virtual Machine.
         */
    }
}
        //вывод
//        Bo-Bo!
//        Go-Go!
