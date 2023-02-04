package gof.behavioral.state.classes;

import lombok.Data;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 11.11.2022 00:09
 * @class User
 */
@Data
public class User {
    String username;
    State state;

    public User(String username, State state) {
        this.username = username;
        changeState(state);
    }

    public void changeState(State state) {
        this.state = state;
        state.changeContext(this);
    }

    public void auth() {
        state.login();
    }

    public void purchase(Product product) {
        state.buyProduct(product);
    }
}
