package ua.com.juja.patterns.Singleton;

/**
 * Created by serzh on 2/5/16.
 */
public class SingletonObject {
    private static SingletonObject object;

    //    private static String lockObj = "Lock"; // Use for locking
    static {
        object = new SingletonObject();
    }

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        /*if (object != null) {
            return object;
        } else {
            // Start a synchronized block, only one thread can enter and stay in the block one at a time
            synchronized (lockObj) {
                if (object == null) {
                    object = new SingletonObject();
                }
            } // End of synchronized block*/
        return object;
    }
}
