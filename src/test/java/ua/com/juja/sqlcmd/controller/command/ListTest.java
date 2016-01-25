package ua.com.juja.sqlcmd.controller.command;

import org.junit.Before;
import ua.com.juja.sqlcmd.model.DatabaseManager;
import ua.com.juja.sqlcmd.view.View;

import static org.mockito.Mockito.mock;

/**
 * Created by serzh on 1/25/16.
 */
public class ListTest {

    private DatabaseManager manager;
    private View view;

    @Before
    public void setup() {
        manager = mock(DatabaseManager.class);
        view = mock(View.class);
    }
}
