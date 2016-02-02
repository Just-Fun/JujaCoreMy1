package ua.com.juja.sqlcmd.test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by serzh on 2/2/16.
 */
public class Main3 {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("/usr/bin/pgadmin3");
        pb.redirectErrorStream(true);
        Process p = pb.start();
        try {
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "CP866");
            BufferedReader br = new BufferedReader(isr);
            OutputStream os = p.getOutputStream();
            Writer w = new PrintWriter(os);
            while (true) {
                Thread.sleep(1000);
                if (br.ready()) {
                    char[] buff = new char[1000];
                    br.read(buff);
                    System.out.println(new String(buff));
                } else {
                    String line = new Scanner(System.in).nextLine();
                    w.write(line + "\n");
                    w.flush();
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
