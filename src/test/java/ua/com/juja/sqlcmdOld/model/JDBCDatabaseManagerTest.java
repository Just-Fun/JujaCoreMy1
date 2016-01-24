package ua.com.juja.sqlcmdOld.model;

/**
 * Created by serzh on 1/23/16.
 */
public class JDBCDatabaseManagerTest extends DatabaseManagerTest {

    @Override
    public DatabaseManager getDatabaseManager() {
        return new JDBCDatabaseManager();
    }
}
