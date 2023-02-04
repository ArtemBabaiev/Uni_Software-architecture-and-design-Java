package gof.behavioral.state.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 11.11.2022 00:06
 * @class State
 */
public interface State {
    void login();

    void buyProduct(Product product);

    void changeContext(User user);
}
