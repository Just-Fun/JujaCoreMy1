package ua.com.juja.collections.List;

import java.util.Arrays;

/**
 * Created by serzh on 2/8/16.
 */
public class ArrayList implements MyList {

    Object[] array;

    public ArrayList(/*Object[] array*/) {
        clear();
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }


    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public void clear() {
        array = new Object[0];
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        return array[index] = element;
    }

    @Override
    public void add(int insertIndex, Object element) {
        Object[] newArray = new Object[size() + 1];
        int index = 0;
        for (; index < insertIndex; index++) {
            newArray[index] = array[index];
        }
        for (; index < size(); index++) {
            newArray[index + 1] = array[index];
        }
        newArray[insertIndex] = element;
        array = newArray;
    }

    @Override
    public Object remove(int removeIndex) {
        if (removeIndex < 0) {
            throw new IllegalArgumentException("Unexpected index - must be positiv, but was: " + removeIndex);
        }
        Object[] newArray = new Object[size() - 1];
        int index = 0;
        for (; index < removeIndex; index++) {
            newArray[index] = array[index];
        }
        for (; index < size() - 1; index++) {
            newArray[index] = array[index + 1];
        }
        array = newArray;
        return array;
    }


    @Override
    public boolean add(Object e) {
        Object[] newArray = new Object[size() + 1];
        for (int index = 0; index < size(); index++) {
            newArray[index] = array[index];
        }
        newArray[size()] = e;
        array = newArray;
        return true;
    }

    @Override
    public int indexOf(Object o) {
        for (int index = 0; index < size(); index++) {
            Object object = get(index);
            if (object == null && o == null || object.equals(o)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return  Arrays.toString(array);
    }
}
