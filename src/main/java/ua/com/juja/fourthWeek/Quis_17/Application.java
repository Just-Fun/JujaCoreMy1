package ua.com.juja.fourthWeek.Quis_17;

/**
 * Created by serzh on 12/16/15.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {

    public static void f() {
        Map map = new LinkedHashMap() {
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return true;
            }
        };
    }
}