package ua.com.juja.tryByMyOneSqlCmd.Controller;

import ua.com.juja.tryByMyOneSqlCmd.ColumnsEditor;
import ua.com.juja.tryByMyOneSqlCmd.model.InMemoryDatabaseManager;
import ua.com.juja.tryByMyOneSqlCmd.view.Console;
import ua.com.juja.tryByMyOneSqlCmd.view.View;

/**
 * Created by serzh on 1/23/16.
 */
public class MainController {

    public static void main(String[] args) {

        View view = new Console();
        InMemoryDatabaseManager manager = new InMemoryDatabaseManager();
        view.write("Привет юзер!");
        while (true) {
            view.write("Введи пожалуйста имя базы данных, имя пользователя и пароль в формате: database|userName|password");
            String string = view.read(); //postgres|postgres|1qwerty
            String[] data = string.split("\\|");
            String databaseName = data[0];
            String userName = data[1];
            String password = data[2];

            try {
                manager.connect(databaseName, userName, password);
                break;
            } catch (Exception e) {
                view.write("Не удача, по причине: " + e.getMessage());
                view.write("Повторите попытку.");
            }
        }
        view.write("Успех!");
    }
}
