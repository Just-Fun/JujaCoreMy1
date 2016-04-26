package ua.com.juja.Interviews.Epam.Epam_test_9;

/**
 * Created by serzh on 4/26/16.
 */
//#7
public class Test implements Runnable {
    class MyObj {
        void waitInfinity() throws InterruptedException {
            while (true) wait(); // IllegalMonitorStateException
        }
    }

    Test() {
        new Thread(this).start();
    }

    public void run() {
        try {
            new MyObj().waitInfinity();
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        new Test();
    }
}
