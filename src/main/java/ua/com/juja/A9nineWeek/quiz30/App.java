package ua.com.juja.A9nineWeek.quiz30;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by serzh on 1/28/16.
 */
public class App {

    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(new UserComparator());
        users.add(new User(10, "Mike"));
        users.add(new User(99, "Mike"));
        users.add(new User(99, "Sara"));
        users.add(new User(99, "Sara"));
        users.add(new User(99, "Anna"));
        System.out.println(users.size());


        for (User user : users) {

        System.out.println(user.age + ", " + user.name);
        }
    }

}

class UserComparator implements Comparator<User> {
    @Override
    public int compare(User userA, User userB) {
        return userB.name.compareTo(userA.name);    }
}
