package ua.com.juja.A8eightWeek.equals;

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

//        System.out.println( app1.equals(app2) );
        app1.str1 = new String("Test1");

        System.out.println(app1.str1.hashCode());
        System.out.println(app2.str1.hashCode());
//        System.out.println(app1.hashCode());
//        System.out.println(app2.hashCode());
//        app2.str1 = "test";
//
//        System.out.println("HashCode: app1.str1 - "
//                + app1.str1.hashCode() + "; app2.str1 - "
//                + app2.str1.hashCode());
//        System.out.println("HashCode: app1.str2 - "
//                + app2.str2.hashCode() + "; app2.str2 - "
//                + app2.str2.hashCode());
//
//        System.out.println( app1.equals(app2) );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        App app = (App) o;

        if (num != app.num) return false;
        if (str1 != null ? !str1.equals(app.str1) : app.str1 != null) return false;
        return str2 != null ? str2.equals(app.str2) : app.str2 == null;

    }

    @Override
    public int hashCode() {
        int result = str1 != null ? str1.hashCode() : 0;
        result = 31 * result + (str2 != null ? str2.hashCode() : 0);
        result = 31 * result + num;
        return result;
    }

    ////    @Override
////    public int hashCode() {
////        int hash = 37;
////
////        hash = hash + str1.hashCode();
////        hash = hash + str2.hashCode();
////        hash = hash + num;
////
////        return hash;
////
////    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (!(obj instanceof App)) return false;
//
//        App app = (App) obj;
//
//        return (str1.equals(app.str1)) && (str2.equals(app.str2)) && (num == app.num);
//    }
}
