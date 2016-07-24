package ua.com.juja.Collections.equals;

/**
 * Created by serzh on 1/21/16.
 */
public class Point {

    public int x;
    public int y;
    public int hashCode() {
        return 1;
    }

  /*  public int hashCode() {
        return x;
    }
    public boolean equals(Object ref) {
        // ...
        Point that = (Point) ref;
        return this.x == that.x;
    }*/

    public static void main(String[] args) {

        // Если x==y, то x.hashCode()==y.hashCode()

        Integer x = 1;
        Integer y = 1;

        boolean b = x.hashCode()==y.hashCode();
        boolean b1 = x.equals(y)==true;
        boolean b2 = x==y;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(b);


      /*  Point app1 = new Point();
        Point app2 = new Point();

        System.out.println(app1.equals(app2));
        System.out.println(app1.hashCode());
        System.out.println(app2.hashCode());*/
    }
}
