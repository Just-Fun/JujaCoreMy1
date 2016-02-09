package ua.com.juja.List;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by serzh on 2/9/16.
 */
public class LinkedList implements MyList {


    private static class Node {
        Node next;
        Node prev;
        Object value;
    }

    public Node root;
    private Node tail;
    private int size = 0;

    @Override
    public int size() {
       /* Node curr = root;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }*/
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object o) {
        Node curr = root;

        while (curr != null) {
            if (curr.value.equals(o)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public boolean add(Object e) {
        if (root == null) {
            root = new Node();
            root.value = e;
            tail = root;
            size++;
            return true;
        }

        Node newElement = new Node();
        newElement.value = e;
        newElement.prev = tail;
        tail.next = newElement;
        newElement.next = null;
        tail = newElement;
        size++;

      /*  Node curr = root;

        if (root == null) {
            root = new Node();
            root.value = e;
            return true;
        }

        while (curr != null) {
            if (curr.next == null) {
                curr.next = new Node();
                curr.value = e;
                curr.next.prev = curr;
                return true;
            }
            curr = curr.next;
        }*/

        return true;
    }

    @Override
    public boolean remove(Object o) {

        Node curr = root;

        while (curr != null) {
            if (curr.value.equals(o)) {
                size--;
                if (root == curr) {
                    root = null;
                    return true;
                } else if ( tail == curr) {
                    curr.prev.next = null;
                    return true;
                }
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public void clear() {

        size = 0;

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {


    }

    @Override
    public Object remove(int index) {

        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        String result = "";
        if (root != null) {
            result += root.value.toString();
        }
        Node curr = root.next;

        while (curr != null) {
            result += ", " + curr.value.toString();
            curr = curr.next;
        }
        return result;
    }
}
