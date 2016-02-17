package ua.com.juja.patterns.Iterator.classic;

/**
 * Created by serzh on 16.02.16.
 */
public interface Iterator<T> {

    void first();

    void next();

    boolean isDone();

    T currentItem();
}
