package ua.com.juja.eightWeek.quize26.GENERICS;

/**
 * Created by serzh on 1/20/16.
 */
public class App {
    public static void main(String[] args) {

        GenericHolder<Number> holder = new GenericHolder<>();
        holder.ref = new Double(0.5);
        Integer obj = (Integer) holder.ref;

    }

}

class GenericHolder<T> {
    T ref;
}
