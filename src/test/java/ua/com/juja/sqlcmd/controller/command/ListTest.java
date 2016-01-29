package ua.com.juja.sqlcmd.controller.command;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import ua.com.juja.sqlcmd.model.DatabaseManager;
import ua.com.juja.sqlcmd.view.View;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

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
        command = new List(manager, view);
    }


    @Test
    public void testPrintGetTableNames() {
        // given
        when(manager.getTableNames()).thenReturn(new String[] {"user", "test"});
        // when
        command.process("list");
        // then
        shouldPrint("[[user, test]]");
    }

    private void shouldPrint(String expected) {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(view, atLeastOnce()).write(captor.capture());
        assertEquals(expected, captor.getAllValues().toString());
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

    @Test
    public void canProcessListWithoutParameter() {
        boolean canProcess = command.canProcess("");
        assertFalse(canProcess);
    }

    @Test
    public void testPrintEmptyTableData() {
        // given
        when(manager.getTableNames()).thenReturn(new String[] {});
        // when
        command.process("list");
        // then
        shouldPrint("[[]]");
    }
}