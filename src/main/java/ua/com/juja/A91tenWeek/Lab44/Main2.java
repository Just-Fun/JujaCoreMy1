package ua.com.juja.A91tenWeek.Lab44;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by serzh on 2/11/16.
 */
public class Main2 {

    public static void main(String[] args) throws IOException {


        String s = "Hello World";

        // create a new StringReader
        StringReader sr = new StringReader(s);

        try {
            boolean end = false;
            while (!end) {
                int read = sr.read();
                if (read == -1) {
                    end = true;
                continue;
                }
                char c = (char) read;
                    System.out.print("" + c);

            }
                sr.close();

            }catch(IOException ex){
                ex.printStackTrace();
            }

    }
}
