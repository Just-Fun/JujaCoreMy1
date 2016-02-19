package ua.com.juja.patterns.Iterator.sample;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by serzh on 2/19/16.
 */
public class ArrayListTest {
    Integer[] listBefore = new Integer[0];
    ArrayList<Integer> list = new ArrayList<>(listBefore);


    @Test
    public void testSizeEmpty() throws Exception {
        assertTrue(list.size() == 0);
        assertFalse(list.size() == 2);
    }

    @Test
    public void testSize() throws Exception {
        list.add(new Integer(2));
        assertTrue(list.size() == 1);
        assertFalse(list.size() == 2);
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(list.isEmpty());
        list.add(new Integer(2));
        assertFalse(list.isEmpty());
    }
/*
    @Test
    public void testContains() throws Exception { // пока не знаю как
        list.add(new Integer(2));
        assertTrue(list.contains(new Integer(2)));
    }*/

    @Test
    public void testIterator() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        assertTrue(list.add(new Integer(2)));
        assertEquals("[2]", list.toString());
    }

    @Test
    public void testRemoveObject() throws Exception {
        listAdd3Integer();
        assertTrue(list.remove(new Integer(1)));
        assertEquals("[2, 3]", list.toString());
        assertFalse(list.remove(new Integer(5)));
    }

    @Test
    public void testRemoveIndex() throws Exception {
        listAdd3Integer();
        assertEquals(1, list.remove(0));
        assertEquals("[2, 3]", list.toString());
    }

    @Test
    public void testClear() throws Exception {
        listAdd3Integer();
        list.clear();
        assertEquals("[]", list.toString());
    }

    @Test
    public void testGet() throws Exception {
        listAdd3Integer();
        assertEquals(2, list.get(1));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetOutOfIndex() throws Exception {
        listAdd3Integer();
        list.get(5);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetOutMinusIndex() throws Exception {
        listAdd3Integer();
        list.get(-2);
    }

    private void listAdd3Integer() {
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
    }

    @Test
    public void testSet() throws Exception {
        listAdd3Integer();
        assertEquals(2, list.set(1, new Integer("5")));
        assertEquals("[1, 5, 3]", list.toString());
    }

    @Test
    public void testAdd1() throws Exception {
        listAdd3Integer();
        list.add(1, 5);
        assertEquals("[1, 5, 2, 3]", list.toString());
    }

    @Test
    public void testAdd1IndexPlusOne() throws Exception {
        listAdd3Integer();
        list.add(3, 5);
        assertEquals("[1, 2, 3, 5]", list.toString());
    }

    @Test
    public void testIndexOf() throws Exception {
        listAdd3Integer();
        assertEquals(-1, list.indexOf(new Integer("5")));
        assertEquals(0, list.indexOf(new Integer("1")));
    }
}