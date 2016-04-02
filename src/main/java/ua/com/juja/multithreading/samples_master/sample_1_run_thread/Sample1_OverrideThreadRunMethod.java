package ua.com.juja.multithreading.samples_master.sample_1_run_thread;

import static ua.com.juja.multithreading.samples_master.ThreadUtils.*;

public class  Sample1_OverrideThreadRunMethod {

    static class MyThread extends Thread {

        private String message;

        public MyThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            while (true) {
                print(message);

                sleepRandom(2000);
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread("Я круче!");
        Thread thread2 = new MyThread("Нет Я!");

        thread1.start();
        thread2.start();

      /*  thread1.run();
        thread2.run();*/
    }
}
