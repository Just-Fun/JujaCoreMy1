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
                } else if (tail == curr) {
                    curr.prev.next = null;
                    return true;
                } else {
                    curr.next.prev = curr.prev;
                    curr.prev.next = curr.next;
                    return true;
                }
            }
            curr = curr.next;
        }
        return false;
    }

    @Override
    public void clear() {
        root = null;
        tail = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        sizeMoreThanIndex(index);
        negativIndex(index);

        int i = 0;
        Node curr = root;

        while (curr != null) {

            if (i == index) {
                return curr.value;
            }
            curr = curr.next;
            i++;
        }
        return null;
    }


    @Override
    public Object set(int index, Object element) {
        sizeMoreThanIndex(index);
        int i = 0;
        Node curr = root;

        while (curr != null) {

            if (i == index) {
                curr.value = element;
                return curr.value;
            }
            curr = curr.next;
            i++;
        }
        return null;
    }

    @Override
    public void add(int index, Object element) {
        sizeMoreThanIndex(index);
        negativIndex(index);

        int i = 0;
        Node curr = root;
        if (index == 0) {
            root.value = element;
        } else if (index == size - 1) {
            tail.value = element;
        } else {
            while (curr != null) {
                if (i == index) {
                    curr.value = element;
                }
                curr = curr.next;
                i++;
            }
        }
    }

    @Override
    public Object remove(int index) {
        sizeMoreThanIndex(index);
        negativIndex(index);

        int i = 0;
        Node curr = root;

        if (index == 0) {
            root = curr.next;
            root.prev = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            while (curr != null) {
                if (i == index) {
                    curr.next.prev = curr.prev;
                    curr.prev.next = curr.next;
                }
                curr = curr.next;
                i++;
            }
        }

        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }


    private void negativIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index can't be negative, index: " + index);
        }
    }

    private void sizeMoreThanIndex(int index) {
        if (index >= size) {
            throw new IllegalArgumentException("Index can't be more than list size. Size: " + ", index: " + index);
        }
    }

    @Override
    public String toString() {
        String result = "";
        if (size == 0) {
            return result;
        }
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
