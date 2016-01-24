package ua.com.juja.sqlcmdOld.Controller;

import ua.com.juja.sqlcmdOld.model.DatabaseManager;
import ua.com.juja.sqlcmdOld.model.JDBCDatabaseManager;
import ua.com.juja.sqlcmdOld.view.Console;
import ua.com.juja.sqlcmdOld.view.View;

/**
 * Created by serzh on 1/23/16.
 */
public class Main {

    public static void main(String[] args) {
        View view = new Console();
        DatabaseManager manager = new JDBCDatabaseManager();

        MainController controller = new MainController(view, manager);
        controller.run();
    }
}
