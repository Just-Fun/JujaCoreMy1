package ua.com.juja.A8eightWeek.quize25.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by serzh on 1/20/16.
 */
public class App {

    public static void main(String[] args) {

        List<String> listA = Arrays.asList("A", "B", "C");
        List<Integer> listB = Arrays.asList(1);
        for (Iterator<String> iterA = listA.iterator(); iterA.hasNext(); ) {
            for (Iterator<Integer> iterB = listB.iterator(); iterB.hasNext(); ) {
                System.out.print(iterA.next() + iterB.next() + " ");
            }
            System.out.println();
        }

        /*List<String> listA = Arrays.asList("A");
        List<Integer> listB = Arrays.asList(1, 2, 3);
        for (Iterator<String> iterA = listA.iterator(); iterA.hasNext(); ) {
            for (Iterator<Integer> iterB = listB.iterator(); iterB.hasNext(); ) {
                System.out.print(iterA.next() + iterB.next() + " ");
            }
            System.out.println();
        }
        System.out.println();*/

        /*List<String> listA = Arrays.asList("A", "B", "C", "D");
        List<Integer> listB = Arrays.asList(1, 2);
        for (Iterator<String> iterA = listA.iterator(); iterA.hasNext(); ) {
            for (Iterator<Integer> iterB = listB.iterator(); iterB.hasNext(); ) {
                System.out.print(iterA.next() + iterB.next() + " ");
            }
            System.out.println();
        }
*/


    }
}

