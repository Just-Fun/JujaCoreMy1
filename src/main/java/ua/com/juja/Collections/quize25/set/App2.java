package ua.com.juja.Collections.quize25.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by serzh on 1/20/16.
 */
public class App2 {

    public static void main(String[] args) {

        Set<Boolean> set = new HashSet<>();

        set.remove(set.remove(set.remove(false)));

        System.out.println(set.size());

        System.out.println(set);
    }
}