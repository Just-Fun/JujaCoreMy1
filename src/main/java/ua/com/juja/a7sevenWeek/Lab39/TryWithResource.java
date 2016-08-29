package ua.com.juja.a7sevenWeek.Lab39;

/**
 * Created by serzh on 1/15/16.
 */
public class TryWithResource {

    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {

        AutoCloseable resource = null;
        AutoCloseable resourceB = null;
        try {
            resource = factoryA.create();
            resourceB = factoryB.create();
            body.runBody();
            try {
                resourceB.close();
            } catch (Throwable closeEx) {

            }
            try {
                resource.close();
            } catch (Throwable closeEx) {

            };
        } catch (Throwable bodyEx) {
            try {
                resourceB.close();
            } catch (Throwable closeEx) {
                bodyEx.addSuppressed(closeEx);
            }
            try {
                resource.close();
            } catch (Throwable closeEx) {
                bodyEx.addSuppressed(closeEx);
            }
        }
    }
}


interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}
