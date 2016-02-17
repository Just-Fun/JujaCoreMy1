package ua.com.juja.patterns.Iterator;

/**
 * Created by serzh on 16.02.16.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    final Object[] array;


    public ConcreteAggregate(int count) {
        this.array = new Object[count];

    }

    public void set(int index, T value) {
        array[index] = value;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<T>(this);
    }
}
