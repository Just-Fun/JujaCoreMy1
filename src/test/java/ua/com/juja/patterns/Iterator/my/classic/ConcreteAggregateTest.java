package ua.com.juja.patterns.Iterator.my.classic;

import org.junit.Test;
import ua.com.juja.patterns.Iterator.my.classic.ConcreteAggregate;
import ua.com.juja.patterns.Iterator.my.classic.Iterator;

import java.util.NoSuchElementException;

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

    @Test
    public void testSecondElement() {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate(2);
        aggregate.set(0, "one");
        aggregate.set(1, "two");

        Iterator<String> iterator = aggregate.createIterator();
        iterator.next();

        String value = iterator.currentItem();

        assertEquals("two", value);
    }

    @Test(expected = NoSuchElementException.class)
    public void outOfRange() {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate(2);
        aggregate.set(0, "one");
        aggregate.set(1, "two");

        Iterator<String> iterator = aggregate.createIterator();
        iterator.next();
        iterator.next();

        iterator.currentItem();
    }

    @Test(expected = NoSuchElementException.class)
    public void outOfRangeEmptyArray() {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate(0);

        Iterator<String> iterator = aggregate.createIterator();

        iterator.currentItem();
    }

    @Test
    public void testEmptyIsDone() {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate(0);

        Iterator<String> iterator = aggregate.createIterator();
        boolean done = iterator.isDone();

        assertTrue(done);
    }

    @Test
    public void testNotEmptyIsDoneFalse() {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate(1);
        aggregate.set(0, "one");

        Iterator<String> iterator = aggregate.createIterator();
        boolean done = iterator.isDone();

        assertFalse(done);
    }

    @Test
    public void tesNotEmptyIsDoneTrue() {

        ConcreteAggregate<String> aggregate = new ConcreteAggregate(1);
        aggregate.set(0, "one");

        Iterator<String> iterator = aggregate.createIterator();
        iterator.next();
        boolean done = iterator.isDone();

        assertTrue(done);
    }
}