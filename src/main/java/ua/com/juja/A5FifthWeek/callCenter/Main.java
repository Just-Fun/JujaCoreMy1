package ua.com.juja.A5FifthWeek.callCenter;

/**
 * Created by serzh on 12/22/15.
 */
public class Main {
    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter(3);
        Client client1 = new Client("Vasya", callCenter);
        Client client2 = new Client("Petia", callCenter);
        Client client3 = new Client("Vova", callCenter);
        Client client4 = new Client("Unluky", callCenter);

    }


}
