package ua.com.juja.Interviews.Epam.Epam_test_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by serzh on 4/26/16.
 */
//#1
public class Test<T> /*implements Iterator<T> */ { // 1 Test is not abstract and does not override abstract method next() in java.util.Iterator
    private List<T> list = new ArrayList<T>(); // 2

    public void addList(T... ts) {
        Collections.addAll(list, ts); // 3
    }

    public static void main(String args[]) {
        Test<String> t = new Test<String>();
        t.addList("Hello world");
        for (String str : t.list) { // 4 тут должен быть не t, а t.list
            System.out.print(str + " ");
        }
    }

    public Iterator iterator() {
        return list.iterator();
    }
}
