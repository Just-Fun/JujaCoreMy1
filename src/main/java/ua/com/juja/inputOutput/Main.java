package ua.com.juja.inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Oleg on 8/1/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println("Read: " + input);
    }

    private static String readString(InputStream inputStream) throws IOException {
        StringBuilder builder = new StringBuilder();
        byte[] buffer = new byte[1];
        while (inputStream.read(buffer) != -1) {
            builder.append(buffer);
        }
        return "";
    }
}
