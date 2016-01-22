package ua.com.juja.eightWeek.lab41;

/**
 * Created by serzh on 1/22/16.
 */
import java.util.Iterator;
import java.util.NoSuchElementException;


public class SimpleLinkedList <E> implements SimpleList<E> {
    private Node<E> first = null; // head
    private Node<E> last = null; // tail
    private int size = 0;

    private static class Node<T> {
        private Node <T> prev;
        private T item;
        private Node <T> next;

        private Node(Node<T> prev, T item, Node<T> next) { //конструктор
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || size < index) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    private Node<E> node(int index) {
        if (index < size / 2) {
            Node<E> tmp = first;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }
    private E unlink(Node<E> x) { //todo:  // отсоединить(перевод unlink)
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    @Override
    public boolean add(E newElement) {
        final Node<E> tmp = last;
        final Node<E> newNode = new Node<>(tmp, newElement, null);
        last = newNode;
        if (tmp == null) {
            first = newNode;
        } else {
            tmp.next = newNode;
        }
        size++;
        return true;
    }
    @Override
    public E get(int index) {
        checkIndex(index);
        return node(index).item;
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
        checkIndex(index);
        return unlink(node(index));
    }
/*BODY*/

    @Override
    public Iterator<E> iterator() {
        return new Iterator <E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                E nextE;
                if (last == null) {
                    throw new NoSuchElementException();
                }
                try {
                    nextE = (E) last.item;
                    currentIndex++;
                } catch (NoSuchElementException e) {
                    throw new NoSuchElementException();
                }

                return nextE;
            }

            @Override
            public void remove() {
                try {
                    SimpleLinkedList.this.remove(currentIndex - 1);
                } catch (Exception e) {
                    throw new IllegalStateException();
                }
            }
        };
    }

    @Override
    public String toString() {
        return "" + first + last + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleLinkedList<?> that = (SimpleLinkedList<?>) o;

        if (size != that.size) return false;
        if (first != null ? !first.equals(that.first) : that.first != null) return false;
        return last != null ? last.equals(that.last) : that.last == null;

    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    // end
}

interface SimpleList<T> {
    public boolean add(T newElement);
    public T get(int index);
    public Iterator<T> iterator();
    public int size();
    public boolean isEmpty();
    public T remove(int index);
}