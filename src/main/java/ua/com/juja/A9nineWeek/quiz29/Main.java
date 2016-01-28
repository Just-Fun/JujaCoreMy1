package ua.com.juja.A9nineWeek.quiz29;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by serzh on 1/28/16.
 */
public class Main {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("Masha");
        set.add("Petia");


        System.out.println(set.iterator().next());
    }
}
