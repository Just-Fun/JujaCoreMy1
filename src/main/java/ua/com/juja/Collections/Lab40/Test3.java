package ua.com.juja.Collections.Lab40;

/**
 * Created by serzh on 1/21/16.
 */
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {

        Integer[] listElements = {1, 2, 3, 4, 5, 6, 7};
        Integer[] expectedElements = {2, 3, 4, 5, 6, 7};

        SimpleArrayList<Integer> arrayList = new SimpleArrayList<>();

        for (int i = 0; i < listElements.length; i++) {
            arrayList.add(listElements[i]);
        }

        SimpleArrayList<Integer> expectedArrayList = new SimpleArrayList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            expectedArrayList.add(expectedElements[i]);
        }

        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = arrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("iterator not implemented");
        }

        if (iterator == null)
            throw new AssertionError("iterator must be no equals null");

        try {
            iterator.next();
            iterator.remove();
        } catch (IllegalStateException e) {
            throw new AssertionError("Non-expected throw IllegalStateException form iterator.remove()");
        }

        if (!arrayList.equals(expectedArrayList))
            throw new AssertionError("actual data is not equal to expected data");

        System.out.print("OK");
    }
}
