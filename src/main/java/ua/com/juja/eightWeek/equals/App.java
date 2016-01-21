package ua.com.juja.eightWeek.equals;

/**
 * Created by serzh on 1/21/16.
 */
public class App {

    String str1 = new String("Test1");
    String str2 = new String("Test2");
    int num = 5;

    public static void main( String[] args )
    {
        App app1 = new App();
        App app2 = new App();
//        app2.num = 6;

        System.out.println( app1.equals(app2) );
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof App)) return false;

        App app = (App) obj;

        return (str1.equals(app.str1)) && (str2.equals(app.str2)) && (num == app.num);
    }
}
