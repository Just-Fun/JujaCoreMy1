package ua.com.juja.FifthWeek.callCenter;

/**
 * Created by serzh on 12/22/15.
 */
public class Client {

    public String name;
    CallCenter callCenter;

    public Client(String name, CallCenter callCenter) {
        this.name = name;
        this.callCenter = callCenter;
        callCenter.findFreeOperator(callCenter);

    }

    public void call() {
        ;
    }


}
