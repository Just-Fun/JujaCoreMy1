package ua.com.juja.sevenWeek.quize26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by serzh on 1/12/16.
 */
public class App {
        // не понял
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
        set.addAll(Arrays.asList(set.isEmpty(), set.isEmpty()));
        set.removeAll(Arrays.asList(set.containsAll(Arrays.asList(set.isEmpty(), set.isEmpty()))));
        System.out.println(set.size());
        System.out.println(set);

    }
}
