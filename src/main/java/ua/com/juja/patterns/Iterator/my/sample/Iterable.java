package ua.com.juja.patterns.Iterator.my.sample;

/**
 * Created by serzh on 2/17/16.
 */
public interface Iterable<T> {
    Iterator<T> iterator();
}
