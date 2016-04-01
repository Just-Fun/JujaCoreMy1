package ua.com.juja.multithreading.samples_master.sample_3_thread_control;


import static ua.com.juja.multithreading.samples_master.ThreadUtils.print;

public class Sample6_ExceptionInThread {

    static class ExceptionListener implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            print("Упал поток: " + t.getName() +
                    " с исключением: " + e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Упс!");
            }
        });

        Thread.setDefaultUncaughtExceptionHandler(new ExceptionListener());

        thread.start();

        Thread.sleep(100);

        print("Пока!");
    }

}
