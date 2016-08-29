package ua.com.juja.List;

import org.junit.Before;
import org.junit.Test;
import ua.com.juja.collections.List.LinkedList;
import ua.com.juja.collections.List.MyList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by serzh on 2/8/16.
 */
public class LinkedListTest {

    MyList list;

    @Before
    public void setup() {
        list = new LinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
    }

    @Test
    public void testSize() throws Exception {
        setup();
        assertEquals(5, list.size());
    }

    @Test
    public void testIsEmpty() throws Exception {
        setup();
        assertEquals(false, list.isEmpty());
        list = new LinkedList();
        assertEquals(true, list.isEmpty());
    }

    @Test
    public void testContains() throws Exception {
        setup();
        assertEquals(true, list.contains("4"));
        assertEquals(false, list.contains("7"));
    }

    @Test
    public void testAdd1() throws Exception {
        setup();
        assertEquals(true, list.add("6"));
        assertEquals("1, 2, 3, 4, 5, 6", list.toString());
        assertEquals(6, list.size());
    }

    @Test
    public void testRemoveListSizeIsOne() throws Exception {
        MyList list = new LinkedList();
        list.add("1");
        assertEquals(true, list.remove("1"));
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveLast() throws Exception {
        MyList list = new LinkedList();
        list.add("1");
        list.add("2");
        assertEquals(true, list.remove("2"));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveMiddle() throws Exception {
        setup();
        list.remove("4");
        assertEquals("1, 2, 3, 5", list.toString());
        assertEquals(true, list.remove("5"));
        assertEquals(false, list.remove("-5"));
    }

    @Test
    public void testGet() throws Exception {
        setup();
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
    }

    @Test
    public void testGetExeption() throws Exception {
        setup();
        try {
            list.get(9);
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
        assertEquals("Index can't be more than list size. Size: 5, index: 9", e.getMessage());
        }
    }

    @Test
    public void testGetIndexNegativ() throws Exception {
        setup();
        try {
            list.get(-1);
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
            assertEquals("Index can't be negative, index: -1", e.getMessage());
        }
    }

    @Test
    public void testSet() throws Exception {
        setup();
        assertEquals("10", list.set(0, "10"));
        assertEquals("30", list.set(2, "30"));
    }

    @Test
    public void testSetExeption() throws Exception {
        setup();
        try {
            list.set(10, "10");
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
            assertEquals("Index can't be more than list size. Size: 5, index: 10", e.getMessage());
        }
    }

    @Test
    public void testAdd() throws Exception {
        setup();
        list.add(1, "10");
        assertEquals("1, 10, 3, 4, 5", list.toString());
        list.add(0,"100");
        assertEquals("100, 10, 3, 4, 5", list.toString());
        list.add(4,"50");
        assertEquals("100, 10, 3, 4, 50", list.toString());
    }

    @Test
    public void testAddExeption() throws Exception {
        setup();
        try {
            list.add(10, "10");
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
            assertEquals("Index can't be more than list size. Size: 5, index: 10", e.getMessage());
        }
    }

    @Test
    public void testRemove1() throws Exception {
        setup();
        list.remove(0);
        assertEquals("2, 3, 4, 5", list.toString());
        setup();
        list.remove(4);
        assertEquals("1, 2, 3, 4", list.toString());
        setup();
        list.remove(2);
        assertEquals("1, 2, 4, 5", list.toString());
    }

    @Test
    public void testRemoveNegativeIndexException() throws Exception {
        setup();
        try {
            list.remove(-4);
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
            assertEquals("Index can't be negative, index: -4", e.getMessage());
        }
    }

    @Test
    public void testIndexOf() throws Exception {
        setup();
        assertEquals(0, list.indexOf("1"));
        assertEquals(4, list.indexOf("5"));
        assertEquals(-1, list.indexOf("6"));
        assertEquals(-1, list.indexOf(""));
    }


    @Test
    public void testIndexOfException() throws Exception {
        setup();
        try {
            list.indexOf(null);
            fail("Expected Exceptions");
        } catch (IllegalArgumentException e) {
            assertEquals("Argument can't be null.", e.getMessage());
        }
    }

    @Test
    public void testClear() throws Exception {
        setup();
        list.clear();
        assertEquals("", list.toString());
    }
}