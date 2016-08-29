package ua.com.juja.fainYakov;

/**
 * Created by serzh on 7/6/16.
 */
// JUGLviv meetup: Reactive Thinking in Java
// https://www.youtube.com/watch?v=3y6NA6BS4Yg
// http://rxmarbles.com/
public class Main {

    public static void main(String[] args) {

        float f1 = 1.12f;
        float f2 = 1.13f;
        System.out.println(f1 + f2);

       /* Math.random();
        for (int i = 0; i < 10; i++) {
        System.out.println(Math.random());
        }
*/

//        List<Beer> americansBeers = new ArrayList<>();
//        List<Beer> beers = new ArrayList<>();
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


    }
}
