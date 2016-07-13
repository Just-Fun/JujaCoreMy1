package ua.com.juja.List;

import org.junit.Before;
import org.junit.Test;
import ua.com.juja.Collections.List.ArrayList;
import ua.com.juja.Collections.List.MyList;

import static org.junit.Assert.*;

/**
 * Created by serzh on 2/8/16.
 */
public class ArrayListTest {

    MyList list;

    @Before
    public void setup() {
        list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(5, list.size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
        setup();
        assertEquals(true, list.contains("4"));
        assertEquals(false, list.contains("7"));
    }

    @Test
    public void testRemove() throws Exception {
        setup();
        list.remove("4");
        assertEquals("[1, 2, 3, 5]", list.toString());
        assertEquals(true, list.remove("5"));
        assertEquals(false, list.remove("-5"));
    }

    @Test
    public void testGet() throws Exception {
        setup();
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        System.out.println(list.toString());
    }

    @Test
    public void testSet() throws Exception {
        setup();
        assertEquals("0", list.set(0, "0"));
    }

    @Test
    public void testAdd() throws Exception {
        setup();
        list.add(1, "1");
        assertEquals("[1, 1, 2, 3, 4, 5]", list.toString());
    }

    @Test
    public void testRemove1() throws Exception {
        setup();
        list.remove(2);
        assertEquals("[1, 2, 4, 5]", list.toString());
    }

    @Test
    public void testRemoveNegativeIndexException() throws Exception {
        setup();
        try {
            list.remove(-4);
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
            assertEquals("Unexpected index - must be positiv, but was: -4", e.getMessage());
        }
    }

    @Test
    public void testAdd1() throws Exception {
        setup();
        assertEquals(true, list.add("6"));
    }

    @Test
    public void testIndexOf() throws Exception {
        setup();
        assertEquals(0, list.indexOf("1"));
        assertEquals(4, list.indexOf("5"));
    }

    @Test
    public void testClear() throws Exception {
        list.clear();
        assertEquals("[]", list.toString());
    }
}