package ua.com.juja.multithreading.samples_master.juja;


import java.util.Arrays;

import static ua.com.juja.multithreading.samples_master.ThreadUtils.print;

public class Sample2_DataRace {


    static class MyRunnable implements Runnable {
        public int getCount() {
            return count;
        }

        private int count = 0; // shared state

//        private static final Object monitor = new Object();

        public void run() {
//            synchronized (monitor) {
                print("Enter: " + count);

                int y = count;
             /*   Thread thread = Thread.currentThread();
                System.out.println("id: " + thread.getId());
                System.out.println("name: " + thread.getName());
                System.out.println("stacktrace: " + Arrays.toString(thread.getStackTrace()));*/

                print("Read: " + y);

                count = y + 1;

                print("Sum: " + count);
            }
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable target1 = new MyRunnable();
        MyRunnable target2 = new MyRunnable();
        MyRunnable target3 = new MyRunnable();
        Thread thread1 = new Thread(target1);
        Thread thread2 = new Thread(target2);
        Thread thread3 = new Thread(target3);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        int f = target1.getCount();
        int s = target1.getCount();
        int t = target1.getCount();

        int i = f + s + t;
        print("Total: " + i);
    }

}
