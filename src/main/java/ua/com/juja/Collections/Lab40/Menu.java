package ua.com.juja.Collections.Lab40;

/**
 * Created by serzh on 1/21/16.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu {

    List<Integer> menuItems;

    public Menu() {
        menuItems = new ArrayList<Integer>();
    }

    public void addItem(Integer item) {
        menuItems.add(item);
    }

    public Iterator<Integer> iterator() {
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<Integer> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= menuItems.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Integer next() {
            return menuItems.get(currentIndex++);
        }

        @Override
        public void remove() {
            menuItems.remove(--currentIndex);
        }

    }

}