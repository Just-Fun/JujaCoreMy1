package ua.com.juja.patterns.iterator.sample;

/**
 * Created by oleksandr.baglai on 16.09.2015.
 */
public class LinkedListTest extends ListTest {

    @Override
    protected List<String> getList() {
        return new LinkedList<String>();
    }
}
