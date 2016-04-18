package ua.com.juja.multithreading.oracle.tutorial;

/**
 * Created by serzh on 06.04.16.
 */
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello from a thread! " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new HelloRunnable());
        Thread thread2 = new Thread(new HelloRunnable());

                thread1.start();
                thread2.start();
    }
}