package ua.com.juja.eightWeek.lab42;

/**
 * Created by serzh on 1/22/16.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SinglyLinkedList <T> {
    private Node<T> first = null;

    public void add(T element) {// добавляем елемент, если first пуст, то first = element
        if (first == null) {
            first = new Node<T>(element);

        } else {                // иначе
            Node<T> current = getLast(); // берем последний элемент
            current.next = new Node<T>(element); // создаем новый элемент и присваеваем ему element
        }
    }

    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {
        Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (current == null) throw new IndexOutOfBoundsException();
            if (current.element == null) throw new NoSuchElementException();
            T element = current.element;
            current = current.next;
            return element;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Node<T> getLast() {
        Node<T> last = first;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    private class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
            this.next = null;
        }
    }
}

class FinderElements {
    public static Integer findElement(SinglyLinkedList<Integer> singlyLinkedList, int k) {
         /*BODY*/
        try {
            ArrayList arrayList = new ArrayList();

            Iterator<Integer> iterator = singlyLinkedList.iterator();
            while (iterator.hasNext()) {
                arrayList.add(iterator.next());
            }
            int size = arrayList.size();
            int index = size - 1 - k;

            return (Integer) arrayList.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }
    }

}
