package ua.com.juja.patterns.Iterator;
/**
 * Created by serzh on 16.02.16.
 */
public interface Aggregate<T> {

    Iterator<T> createIterator();


}
