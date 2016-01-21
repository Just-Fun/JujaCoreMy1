package ua.com.juja.eightWeek.Lab40;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * Created by serzh on 1/20/16.
 */

public class SimpleArrayList<E> implements SimpleList<E> {

    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] data;
    private int size = 0;

    public SimpleArrayList() { // конструктор, если массив пуст
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public SimpleArrayList(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity]; // "копируем" в data переданный в конструктор массив
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
        E oldValue = data[index]; // сохранили значение, которое будем удалять
        int numMoved = size - index - 1; // узнали длину строки для копирования
        System.arraycopy(data, index + 1, data, index, numMoved); // скопировали на место удаленного элемента строку,
        //начиная со следующего элемента до конца
        data[--size] = null; // последний элемент в массиве data делаем null
        return oldValue;
    }

    private void rangeCheck(int index) {
        if (index < 0 || size < index) { // если индекс меньше 0 или больше длины массива - кидаем иксепшин.
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void ensureCapacity(int minCapacity) { // создаем массив с size + 1
        if (minCapacity > data.length) {
            int newCapacity = Math.max(minCapacity, data.length + (data.length >> 1));
            E[] newData = (E[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, data.length);
            this.data = newData;
        }
    }


    @Override
    public Iterator<E> iterator() {

        return new Iterator <E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && data[currentIndex] != null;
            }

            @Override
            public E next() {
                E nextE;
                if (data[currentIndex] == null) {
                    throw new NoSuchElementException();
                }
                try {
                    nextE = data[currentIndex++];
                } catch (NoSuchElementException e) {
                    throw new NoSuchElementException();
                }

                return nextE;
            }

            @Override
            public void remove() {
                try {
                    SimpleArrayList.this.remove(currentIndex - 1);
                } catch (Exception e) {
                    throw new IllegalStateException();
                }
            }
        };
    }

    @Override
    public String toString() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (data[i] != null) count++;
        }
        SimpleArrayList pr = new SimpleArrayList(count);
        System.arraycopy(data, 0, pr.data, 0, count);
        return Arrays.toString(pr.data);
    }

    @Override
    public boolean equals(Object o) { // создал автоматом
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleArrayList<?> that = (SimpleArrayList<?>) o;

        if (size != that.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(data, that.data);

    }

    @Override
    public int hashCode() { // создал автоматом
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
