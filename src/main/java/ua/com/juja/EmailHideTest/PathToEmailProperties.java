package ua.com.juja.EmailHideTest;

import java.io.*;
import java.util.Properties;

/**
 * Created by serzh on 12/29/15.
 */
public class PathToEmailProperties {

    public static void main(String[] args) throws IOException {

        String email = null;
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("/home/serzh/Downloads/Pr");
            properties.load(fileInputStream);
            email = properties.getProperty("email", "example@mail.com");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(email);
    }
}
