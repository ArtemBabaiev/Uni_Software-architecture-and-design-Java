package gof.behavioral.state.classes;

import lombok.ToString;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 11.11.2022 00:10
 * @class ActiveState
 */
@ToString
public class ActiveState implements State {
    User user;

    @Override
    public void login() {
        System.out.println("Login successful. Welcome " + user.username);
    }

    @Override
    public void buyProduct(Product product) {
        System.out.println(user.username + "bought");
    }

    @Override
    public void changeContext(User user) {
        this.user = user;
    }
}
