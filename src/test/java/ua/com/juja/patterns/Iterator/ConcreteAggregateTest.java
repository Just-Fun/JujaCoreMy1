package ua.com.juja.patterns.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 2/17/16.
 */
public class ConcreteAggregateTest {

    @Test
    public void testFirsElement() {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate(2);
        aggregate.set(0, "one");
        aggregate.set(1, "two");

        Iterator<String> iterator = aggregate.createIterator();

        String value = iterator.currentItem();

        assertEquals("one", value);
    }

//    @After
//    public void tearDown() throws Exception {
//
//    }
//
//    @Test
//    public void testSet() throws Exception {
//
//    }
//
//    @Test
//    public void testCreateIterator() throws Exception {
//
//    }
}