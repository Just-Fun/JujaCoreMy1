package ua.com.juja.oop.My;

/**
 * Created by serzh on 12/13/15.
 */
public class NumberGenerator {
    private int current;

    public NumberGenerator() {
        current = 1;
    }

    public int getNext() {
        int result = current;
        current++;
        return result;
    }

}

