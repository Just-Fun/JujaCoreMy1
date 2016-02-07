package ua.com.juja.patterns.helloWorld;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by serzh on 2/4/16.
 */
public class InMemoryStrategy implements Strategy {
    private List<String> messages = new LinkedList<>();

    @Override
    public void print(String message) {
        messages.add(message);

    }

    public List<String> getMessages() {
        return messages;
    }
}
