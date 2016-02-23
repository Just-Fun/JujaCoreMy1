package ua.com.juja.patterns.iterator.classic;

/**
 * Created by oleksandr.baglai on 16.09.2015.
 */
public interface Iterator<T> {

    void first();

    void next();

    boolean isDone();

    T currentItem();
}
