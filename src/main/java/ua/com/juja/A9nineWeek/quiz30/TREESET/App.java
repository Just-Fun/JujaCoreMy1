package ua.com.juja.A9nineWeek.quiz30.TREESET;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by serzh on 1/28/16.
 */
public class App {

    public static void main(String[] args) {
        NavigableSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("AB");
        set.add("B");
        set.add("A");
        set.add("BA");
        set.add("B");

        System.out.println(set.floor("BB"));

        System.out.println(set);
    }
}
