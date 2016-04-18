package ua.com.juja.multithreading.oracle.tutorial;

/**
 * Created by serzh on 06.04.16.
 */
public class HelloThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello from a thread! " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new HelloThread();
        Thread thread2 = new HelloThread();

                thread1.start();
                thread2.start();
    }
}