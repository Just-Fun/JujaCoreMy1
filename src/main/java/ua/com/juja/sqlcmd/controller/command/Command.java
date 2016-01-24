package ua.com.juja.sqlcmd.controller.command;

/**
 * Created by serzh on 1/24/16.
 */
public interface Command {

    boolean canProcess(String command);

    void process(String command);


}
