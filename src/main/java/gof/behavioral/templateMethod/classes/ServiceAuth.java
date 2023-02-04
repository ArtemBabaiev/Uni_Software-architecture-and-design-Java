package gof.behavioral.templateMethod.classes;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 17.11.2022 23:56
 * @class ServiceAuth
 */
public abstract class ServiceAuth {

    public ServiceAuth() {
    }

    public User login() {
        if (tryConnect()) {
            List<String> strings = requestData();
            return handleCallback(strings.get(0), strings.get(1));
        }
        return null;
    }

    public User handleCallback(String username, String password) {
        return new User(username, password);
    }

    public abstract boolean tryConnect();

    public abstract List<String> requestData();

}
