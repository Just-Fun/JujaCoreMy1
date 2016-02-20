package ua.com.juja.patterns.Iterator.my.sample;

/**
 * Created by serzh on 2/17/16.
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

    void remove();
}
