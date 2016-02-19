package ua.com.juja.patterns.Iterator.sample;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by serzh on 2/17/16.
 */
public class ArrayList<T> implements List {
    Object[] list;
    int modCount;

    public ArrayList(Object[] list) {
        this.list = list;
    }

    @Override
    public int size() {
        int size = 0;
        return list.length;
    }

    @Override
    public boolean isEmpty() {

        return size() == 0;
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

        return new ArrayListIterator();
    }

    @Override
    public boolean add(Object object) {
        Object[] newList = new Object[size() + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[size()] = object;
        list = newList;
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
                    newList[k - 1] = list[k];
                }
                list = newList;
                return true;
            }
        }

        return false;
    }

    @Override
    public void clear() {
        list = new Object[0];
    }

    @Override
    public Object get(int index) {
        noSuchElement(index);
        for (int i = 0; i < list.length; i++) {
            if (i == index) {
                return list[i];
            }
        }
        return null;
    }

    @Override
    public Object set(int index, Object object) {
        noSuchElement(index);
        for (int i = 0; i < list.length; i++) {
            if (i == index) {
                Object remove = list[i];
                list[i] = object;
                return remove;
            }
        }
        return null;
    }

    @Override
    public void add(int index, Object object) {
        if (index < 0 || index > size()) {
            throw new NoSuchElementException();
        }
        Object[] newList = new Object[size() + 1];
        for (int i = 0; i < index; i++) {
            newList[i] = list[i];
        }
        newList[index] = object;
        for (int j = index + 1; j < newList.length; j++) {
            newList[j] = list[j - 1];

        }
        list = newList;

    }

    @Override
    public Object remove(int index) {
        Object result = null;
        noSuchElement(index);
        Object[] newList = new Object[size() - 1];
        for (int i = 0; i < index; i++) {
            newList[i] = list[i];
        }
        for (int j = index; j < newList.length; j++) {
            newList[j] = list[j + 1];

        }
        result = list[index];
        list = newList;
        return result;
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < list.length; i++) {
            if (object.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    private void noSuchElement(int index) {
        if (index < 0 || index >= size()) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayList<?> arrayList = (ArrayList<?>) o;

//        if (modCount != arrayList.modCount) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(list, arrayList.list);

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(list);
        result = 31 * result + modCount;
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    private class ArrayListIterator<T> implements Iterator {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}

