package ua.com.juja.multithreading.samples_master.sample_3_thread_control;


import static ua.com.juja.multithreading.samples_master.ThreadUtils.print;

public class Sample5_Join {

    static class MyRunnable implements Runnable {

        private int count;

        public MyRunnable(int count) {
            this.count = count;
        }

        @Override
        public void run() {
            while (count-- > 0) {
                print(String.valueOf(count + 1));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

       /* ThreadGroup threadGroup = new ThreadGroup("Parent ThreadGroup");
        Thread thread2 = new Thread(threadGroup, new MyRunnable(2));
        Thread thread3 = new Thread(threadGroup, new MyRunnable(2));*/

        Thread thread2 = new Thread(new MyRunnable(2));
        Thread thread3 = new Thread(new MyRunnable(2));

        Thread thread1 = new Thread(new MyRunnable(4));
        thread1.setDaemon(true);

        thread2.start();
        thread3.start();
        thread1.start();
//        System.out.println("active threads in threadGroup: " + threadGroup.activeCount());

        thread1.join();
        print("Thread 1 finished");

        thread2.join();
        print("Thread 2 finished");

        thread3.join();
        print("Thread 2 finished");
    }

}
