package ua.com.juja.sqlcmd.controller.command;

import org.junit.Before;
import org.junit.Test;
import ua.com.juja.sqlcmd.model.DatabaseManager;
import ua.com.juja.sqlcmd.view.View;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by serzh on 1/25/16.
 */
public class ListTest {

    private DatabaseManager manager;
    private View view;
    private Command command;

    @Before
    public void setup() {
        manager = mock(DatabaseManager.class);
        view = mock(View.class);
        command = new List(manager,view);
    }

    @Test
    public void canProcessListWithRightParameter() {
        boolean canProcess = command.canProcess("list");
        assertTrue(canProcess);
    }

    @Test
    public void canProcessListWithWrongParameter() {
        boolean canProcess = command.canProcess("ghkk");
        assertFalse(canProcess);
    }
}
