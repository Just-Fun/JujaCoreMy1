package ua.com.juja.Collections.jenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
