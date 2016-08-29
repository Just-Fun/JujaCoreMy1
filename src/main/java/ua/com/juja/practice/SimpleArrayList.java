package ua.com.juja.practice;

/**
 * Created by serzh on 23.07.16.
 */

import java.util.Arrays;
import java.util.Iterator;

public class SimpleArrayList<E> implements SimpleList<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public SimpleArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    @Override
    public boolean add(E newElement) {
        ensureCapacity(size + 1);
        data[size] = newElement;
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        rangeCheck(index);
        return data[index];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                if (index < size) {
                    return true;
                }
                return false;
            }

            @Override
            public E next() {
                index++;
                return data[index];
            }

            @Override
            public void remove() {
                SimpleArrayList.this.remove(index - 1);
            }
        };
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E remove(int index) {
        rangeCheck(index);
        E oldValue = data[index];
        int numMoved = size - index - 1;
        System.arraycopy(data, index + 1, data, index, numMoved);
        data[--size] = null;
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleArrayList<?> that = (SimpleArrayList<?>) o;

        if (size != that.size) return false;
        // Probably incorrect - comparing Object[] arrays with arrays.equals
        return Arrays.equals(data, that.data);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(data);
        result = 31 * result + size;
        return result;
    }
}

interface SimpleList<E> {
    public boolean add(E newElement);

    public E get(int index);

    public Iterator<E> iterator();

    public int size();

    public boolean isEmpty();

    public E remove(int index);
}