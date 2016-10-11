package ua.com.juja.presentations.gc;

import java.lang.ref.SoftReference;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/20/14
 * Time: 8:57 PM
 */
public class SoftReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        SoftReference references[] = new SoftReference[1000];
        int counter = 0;
        while (counter < 1000) {
            System.out.println();
            for (int i = 0; i < counter; i++) {
                System.out.print(references[i].get() == null ? "*" : "E");
            }
            references[counter++] = new SoftReference<>(new byte[100_000_000]);
            Thread.sleep(100);
        }
    }
}
