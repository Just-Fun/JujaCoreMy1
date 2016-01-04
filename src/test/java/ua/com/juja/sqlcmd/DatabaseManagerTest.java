package ua.com.juja.sqlcmd;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by serzh on 1/3/16.
 */
public class DatabaseManagerTest {
    private DatabaseManager manager;

    @Before
    public void setup() {
        manager = new DatabaseManager();
        manager.connect("sqlcmd", "postgres", "1qwerty");
    }

    @Test
    public void testGetAllTableNames() {
        String[] tableNames = manager.getTablesNames();
        assertEquals("[user, test]", Arrays.toString(tableNames));
    }

}
