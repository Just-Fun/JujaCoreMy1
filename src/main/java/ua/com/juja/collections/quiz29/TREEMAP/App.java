package ua.com.juja.collections.quiz29.TREEMAP;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by serzh on 1/27/16.
 */
public class App {

    public static void main(String[] args) {
        NavigableSet<User> users = new TreeSet<>();
        users.add(new User(25, "Mike"));
        users.add(new User(25, "Sara"));
        users.add(new User(26, "Sara"));
        System.out.println(users);


        System.out.println(users.descendingSet().descendingIterator().next());
    }
}
class User implements Comparable<User> {
    public String name;
    public int age;

    User(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + name + ", " + age + "}";
    }

    @Override
    public int compareTo(User that) {
        int result = that.name.compareTo(this.name);
        if (result != 0) {
            return result;
        } else {
            return this.age - that.age;
        }
    }
}