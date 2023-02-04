package gof.creational.poolOfObject.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 30.09.2022 04:47
 * @class DbConnection
 */
@Data
@AllArgsConstructor
public class DbConnection {
    private String connectionString;
    String status;

    public void processing() {
        System.out.println("DbConnection : " + connectionString + " is " + status);
    }
}
