package ua.com.juja.sqlcmdOld.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by serzh on 1/11/16.
 */
public class Console implements View {
    @Override
    public void write(String message) {
        System.out.println(message);
    }

    @Override
    public String read() {

        /*Scanner scanner =  new Scanner(System.in);
        return scanner.nextLine();*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        try {
            line = reader.readLine();
        } catch (IOException e) {
            System.out.println("Не считал " + e);
        }
        return line;
    }
}
