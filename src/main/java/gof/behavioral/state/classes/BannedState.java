package gof.behavioral.state.classes;

import lombok.ToString;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 11.11.2022 00:10
 * @class BannedState
 */
@ToString
public class BannedState implements State {
    User user;

    @Override
    public void login() {
        System.out.println("User\"" + user.username + "\" is banned, login denied");
    }

    @Override
    public void buyProduct(Product product) {
        System.out.println("User\"" + user.username + "\" is banned, purchase denied");
    }

    @Override
    public void changeContext(User user) {
        this.user = user;
    }
}
