package ua.com.juja.FainYakov;

import javafx.beans.Observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serzh on 7/6/16.
 */
public class Main {

    public static void main(String[] args) {
        List<Beer> americansBeers = new ArrayList<>();
        List<Beer> beers = new ArrayList<>();
//        Observable<Beer> beerObservable = null;
//        fillList(beers);

       /* beers
                .skip(1)
                .take(4)
                .filter(beer -> "USA".equals(beer.getCountry()))
                .map(beer -> beer.getCountry() + " : " + beer.getType())
                .subscribe(
                        beer -> System.out.println(beer),
                        err -> System.out.println(err),
                        () -> System.out.println("Streaming is complited");*/

//        filterAndPrint(beers);
//        addIfUSA(americansBeers, beers);
//        printList(beers);

    }

    /*private static void filterAndPrint(List<Beer> beers) {
        beers.stream()
                .skip(1)
                .limit(4)
                .filter(beer -> "USA".equals(beer.getCountry()))
                .map(beer -> beer.getCountry() + " : " + beer.getType())
                .forEach(beer -> System.out.println(beer));
    }

    private static void printList(List<Beer> americansBeers) {
        int count = 0;
        for (Beer beer : americansBeers) {
            System.out.printf("%s: %s : %s%n", ++count, beer.getCountry(), beer.getType());
        }
    }

    private static void addIfUSA(List<Beer> americansBeers, List<Beer> beers) {
        beers.forEach(beer -> {
            if ("USA".equals(beer.getCountry())) {
                americansBeers.add(beer);
            }
        });
    }*/

    /*private static void fillList(List<Beer> beers) {
        beers.add(new Beer("pils", "USA"));
        beers.add(new Beer("pils", "Germany"));
        beers.add(new Beer("blue", "USA"));
        beers.add(new Beer("red", "USA"));
        beers.add(new Beer("white", "USA"));
        beers.add(new Beer("white", "Poland"));
        beers.add(new Beer("grey", "USA"));
    }*/
}
