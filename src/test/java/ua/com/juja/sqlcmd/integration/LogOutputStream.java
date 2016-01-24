package ua.com.juja.sqlcmd.integration;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by serzh on 1/24/16.
 */
public class LogOutputStream extends OutputStream {

    private String log;

    @Override
    public void write(int b) throws IOException {
        log += String.valueOf((char)b);
    }

    public String getData() {
        return log;
    }
}
