package ua.com.juja.collections.Lab40;

/**
 * Created by serzh on 1/21/16.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Test2 {
    public static void main(String[] args) {

        // list is one element
        Integer testOneElement = 1;
        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        simpleArrayList.add(testOneElement);

        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = simpleArrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("iterator not implemented");
        }

        if (iterator == null)
            throw new AssertionError("iterator must be no equals null");

        // call before get element
        if (!iterator.hasNext())
            throw new AssertionError("hasNext() must be returned true if list is not empty");

        // get element
        boolean isExceptionMethodNext = false;
        Integer actualResultNext = null;
        try {
            actualResultNext = iterator.next();
        } catch (NoSuchElementException e) {
            isExceptionMethodNext = true;
        }

        //call after get one element
        if (iterator.hasNext())
            throw new AssertionError("hasNext() must be returned false if no element");


        if (isExceptionMethodNext)
            throw new AssertionError("next() must be throw NoSuchElementException if no element");

        if (actualResultNext.compareTo(testOneElement) != 0)
            throw new AssertionError("OneElement must be equals " + testOneElement.toString() + " but found " + actualResultNext.toString());


        System.out.print("OK");
    }
}
