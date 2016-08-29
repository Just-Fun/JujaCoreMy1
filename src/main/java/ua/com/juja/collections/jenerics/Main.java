package ua.com.juja.collections.jenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serzh on 8/10/16.
 */
public class Main {
    public static void main(String[] args) {
//        Stream.of(Person.class.getDeclaredMethods()).forEach(System.out::println);

        List<? extends Number> numbers;
        numbers = new ArrayList<Integer>();
    }
}
