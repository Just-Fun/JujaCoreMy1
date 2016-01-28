package ua.com.juja.A9nineWeek.quiz29.HASHMAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by serzh on 1/28/16.
 */
public class App {

    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("A", "A"); // A=A
        Map<String, String> mapB = new HashMap<>();
        mapB.put("B", "B");// B=B
        mapA.putAll(mapB); // mapA -> A=A,B=B
        mapB.put("C", "C"); // C=C
        mapB.putAll(mapA);// mapB -> C=C,A=A,B=B
        System.out.println(mapA.size() + mapB.size());

        System.out.println(mapA);
//        System.out.println(map.entrySet().toString());

//        System.out.println(map.size());
    }
}
