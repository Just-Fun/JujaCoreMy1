package ua.com.juja.OOP.Example;

/**
 * Created by serzh on 17.07.16.
 */
public class Cello implements Instrument, Cloneable{

    private String[] string = {"C", "G", "D", "A"};
    private String stringC = "C";

    public String[] getString() {
        String[] copy = string.clone();
        return copy;
    }

    public String getStringC() {
        return stringC;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void play() {
        System.out.println("Play");
    }
}
