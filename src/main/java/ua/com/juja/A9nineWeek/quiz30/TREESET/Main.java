package ua.com.juja.A9nineWeek.quiz30.TREESET;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by serzh on 1/28/16.
 */
public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);


        System.out.println(set.floor(3));
        System.out.println(set.ceiling(2));
        System.out.println(set.lower(3));
        System.out.println(set.higher(3));
        System.out.println(set);
    }
}
