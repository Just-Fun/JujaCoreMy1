package ua.com.juja.algoritms.QUIZ10;

/**
 * Created by Oleg on 11/26/2015.
 */
public class FibonacchiApp {
    public static void main(String[] args) {
        f(3);
    }

    private static int f(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = n;
        } else {
            result = f(n - 1) + f(n - 2);
        }
        System.out.print(n);
        return result;
    }
}
