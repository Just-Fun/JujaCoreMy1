package ua.com.juja.collections.quize25.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by serzh on 1/12/16.
 */
public class App {
        // не понял
    public static void main(String[] args) {
        Set<Boolean> set = new HashSet<>();
//        System.out.println(set);
//
//        boolean f1=set.add(true);
//        System.out.println("f1: " + f1);
//        System.out.println(set);
//
//        boolean f2=set.add(f1);
//        System.out.println("f2: " + f2);
//        System.out.println(set);
//        System.out.println();
//
//        boolean f3=set.add(f2);
//        System.out.println("f3: " + f3);
//        System.out.println(set);
//        set.add(f3);
        set.add(set.add(set.add(true)));

        System.out.println(set.size());
        System.out.println(set);

    }
}
