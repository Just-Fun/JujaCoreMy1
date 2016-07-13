package ua.com.juja.Collections.List;

/**
 * Created by serzh on 2/8/16.
 */
public interface MyList<Object> {
    //Iterable
//    MyIterator iterator();

//    Collection
    int size();
    boolean isEmpty();
    boolean contains(Object o);
//    Object[] toArray();
//    Object[] toArray(Object[] a);
    boolean add(Object e);
    boolean remove(Object o);
//    boolean containsAll(MyList c);
//    boolean addAll(MyList c);
//    boolean removeAll(MyList c);
//    boolean retainAll(MyList c);
    void clear();
//    boolean equals(Object o);
//    int hashCode();

    // List
//    boolean addAll(int index, MyList c);
    Object get(int index);
    Object set(int index, Object element);
    void add(int index, Object element);
    Object remove(int index);
    int indexOf(Object o);
//    int lastIndexOf(Object o);
//    MyList subList(int fromIndex, int toIndex);

//    ListIterator<E> listIterator();
//    ListIterator<E> listIterator(int index);




}
