package ua.com.juja.emailHideTest;

import java.io.*;
import java.util.Properties;

/**
 * Created by serzh on 12/29/15.
 */
// Работает :)
public class PathToEmailProperties {

    public static void main(String[] args) throws IOException {

        String email = null;
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/serzh/Desktop/text2.txt");
            properties.load(fileInputStream);
            email = properties.getProperty("email", "example@mail.com");
        } catch (FileNotFoundException e) {
            email = "example@mail.com";
            e.printStackTrace();
        }

        System.out.println(email);
    }
}
