package gof.creational.poolOfObject.classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 30.09.2022 04:47
 * @class ConnectionPool
 */
public class ConnectionPool {
    private List<DbConnection> pool;

    public ConnectionPool() {
        this.pool = Arrays.asList(
                new DbConnection("localhost:3306", "waiting"),
                new DbConnection("localhost:72012", "waiting"),
                new DbConnection("localhost:1234", "waiting")
        );
    }

    public DbConnection getConnection() {
        DbConnection waiting = pool.stream().filter(dbConnection -> Objects.equals(dbConnection.getStatus(), "waiting")).findFirst().orElse(null);
        if (waiting != null) {
            waiting.setStatus("working");
        }
        return waiting;
    }

    public void releaseConnection(DbConnection dbConnection) {
        if (dbConnection != null) {
            dbConnection.setStatus("waiting");
        }
    }
}
