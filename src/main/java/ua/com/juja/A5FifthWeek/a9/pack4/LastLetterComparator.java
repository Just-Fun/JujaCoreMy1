package ua.com.juja.A5FifthWeek.a9.pack4;

/**
 * Created by serzh on 12/27/15.
 */
public class LastLetterComparator implements Comparator {
    @Override
    public boolean compare(Object o1, Object o2) {
        int o1Length = o1.toString().length();
        int o2Length = o2.toString().length();

        return o1.toString().charAt(o1Length - 1) > o2.toString().charAt(o2Length - 1);
    }
}
