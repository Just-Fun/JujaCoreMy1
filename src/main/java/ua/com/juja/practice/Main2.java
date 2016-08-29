package ua.com.juja.practice;

import java.util.*;

/**
 * Created by serzh on 23.07.16.
 */
public class Main2 {

    public static void main(String[] args) {

        List<String> list = new java.util.LinkedList<>(Arrays.asList("A", "B", "C"));
        list.retainAll(Arrays.asList("A", "B"));
//        Iterator iterator = list.iterator();
        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
//        list.forEach(System.out::println);

        Set<Boolean> set = new HashSet<>();
        set.addAll(Arrays.asList(set.isEmpty(), set.isEmpty()));
        set.retainAll(Arrays.asList(set.containsAll(Arrays.asList(set.isEmpty(), set.isEmpty()))));
        System.out.println(set.size());

        /*int[] array = {1, 3, 5};

        int[] arrayCopy = array.clone();

        arrayCopy[0] = 7;
        System.out.println(array[0]);
*/



       /* String builder = new StringBuilder("qwerty\\uD83F\\uDFFA").reverse().toString();
        System.out.println(builder);*/
    }
}
