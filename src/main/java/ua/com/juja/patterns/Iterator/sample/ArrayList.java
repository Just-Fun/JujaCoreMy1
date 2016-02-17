package ua.com.juja.patterns.Iterator.sample;

import java.util.Arrays;

/**
 * Created by serzh on 2/17/16.
 */
public class ArrayList<T> implements List {
    Object[] list;
    int modCount;

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object o1 : list) {
            if (o1.equals(0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean add(Object object) {
        Object[] newList = new Object[size() + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[size()] = object;
        return true;
    }

    @Override
    public boolean remove(Object object) {

        for (int i = 0; i < list.length; i++) {
            if (object.equals(list[i])) {
                Object[] newList = new Object[size() - 1];
                for (int j = 0; j < i; j++) {
                    newList[j] = list[j];
                }
                for (int k = i + 1; k < list.length; k++) {
                    newList[k] = list[k - 1];
                }
                return true;
            }
        }

        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object object) {
        return null;
    }

    @Override
    public void add(int index, Object object) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }
}
