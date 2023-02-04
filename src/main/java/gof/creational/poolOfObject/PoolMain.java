package gof.creational.poolOfObject;

import gof.creational.poolOfObject.classes.ConnectionPool;
import gof.creational.poolOfObject.classes.DbConnection;

import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 30.09.2022 04:37
 * @class PoolMain
 */
public class PoolMain {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool();
        List<DbConnection> dbConnections = Arrays.asList(
                connectionPool.getConnection(),
                connectionPool.getConnection(),
                connectionPool.getConnection(),
                connectionPool.getConnection()
        );
        dbConnections.forEach(System.out::println);
        dbConnections.forEach(connectionPool::releaseConnection);
        dbConnections.forEach(System.out::println);


    }
}
