package ua.com.juja.patterns.Iterator.sample;

/**
 * Created by serzh on 2/17/16.
 */
public interface Iterable<T> {
    Iterator<T> iterator();
}
