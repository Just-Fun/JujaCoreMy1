package ua.com.juja.presentations.autoboxing;

/**
 * Created with IntelliJ IDEA.
 * User: viktor
 * Date: 10/23/14
 * Time: 3:02 PM
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager (){

    }

    public static SingletonEager getInstance(){
        return instance;
    }
}

//class SingletonSubclass extends SingletonEager{
//
//}