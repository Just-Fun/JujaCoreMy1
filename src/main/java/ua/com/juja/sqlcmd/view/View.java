package ua.com.juja.sqlcmd.view;

/**
 * Created by serzh on 1/11/16.
 */
public interface View {

    void write(String message);

    String read();
}
