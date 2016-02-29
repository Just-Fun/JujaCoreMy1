package ua.com.juja.patterns.iterator.classic;

/**
 * Created by oleksandr.baglai on 16.09.2015.
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();
}
