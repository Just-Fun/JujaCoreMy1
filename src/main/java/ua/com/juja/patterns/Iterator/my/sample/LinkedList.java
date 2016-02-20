package ua.com.juja.patterns.Iterator.my.sample;

import java.util.Objects;

/**
 * Created by serzh on 20.02.16.
 */
public class LinkedList<T> implements List<T> {

    private Node root;
    private int modCount;

    private static class Node {
        private Node next;
        private Objects value;
    }

    @Override
    public Iterator<T> iterator() {

        return new LinkedListIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if (root.value == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean add(T object) {
        if (root == null) {
            root = (Node) object;
        }

        return false;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public void clear() {
        root.value = null;
        root.next = null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T object) {
        return null;
    }

    @Override
    public void add(int index, T object) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }


    private class LinkedListIterator implements Iterator<T> {
        int index;
        Node cursor;
        Node prev;
        Node nextN;

        public LinkedListIterator() {
            index = -1;
            prev = null;
            cursor = root;
        }

        @Override
        public boolean hasNext() {
            return cursor.next != null;
        }

        @Override
        public T next() {
            prev = cursor;
            cursor = cursor.next;
            return (T) prev;
        }

        @Override
        public void remove() {

        }
        /*
        private Node root;

        private static class Node {
            private Node next;
            private Objects value;
    }
    */
    }
}
