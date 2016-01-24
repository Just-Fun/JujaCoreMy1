package ua.com.juja.sqlcmd.controller.command;

import ua.com.juja.sqlcmd.view.View;

/**
 * Created by serzh on 1/24/16.
 */
public class Unsupported implements Command {
    private View view;

    public Unsupported(View view) {
        this.view = view;
    }

    @Override
    public boolean canProcess(String command) {
        return true;
    }

    @Override
    public void process(String command) {
        view.write("Несуществующая команда: " + command);
    }
}
