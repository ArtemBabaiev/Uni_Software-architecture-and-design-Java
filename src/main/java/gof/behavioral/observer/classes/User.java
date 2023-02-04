package gof.behavioral.observer.classes;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 10.11.2022 23:47
 * @class User
 */
@ToString
@AllArgsConstructor
public class User implements ProductListener {
    String username;

    @Override
    public void handleEvent(String message) {
        System.out.println("User \"" + username + " was notified with message=" + message);
    }
}
