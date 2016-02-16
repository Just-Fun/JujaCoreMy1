package ua.com.juja.patterns.Iterator;

/**
 * Created by serzh on 16.02.16.
 */
public class ConcreteAggregate<T> implements Aggregate {


    private int i;

    public ConcreteAggregate(int i) {

        this.i = i;
    }
}
