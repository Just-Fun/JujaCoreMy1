package ua.com.juja.sqlcmdOld.model;

/**
 * Created by serzh on 1/23/16.
 */
public class InMemoryDatabaseManagerTest extends DatabaseManagerTest {

    @Override
    public DatabaseManager getDatabaseManager() {
        return new InMemoryDatabaseManager();
    }

}
