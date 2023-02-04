package gof.behavioral.state;

import gof.behavioral.state.classes.ActiveState;
import gof.behavioral.state.classes.BannedState;
import gof.behavioral.state.classes.User;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 11.11.2022 00:06
 * @class StateMain
 */
public class StateMain {
    public static void main(String[] args) {
        User user = new User("user123", new ActiveState());
        user.auth();
        user.changeState(new BannedState());
        user.auth();
    }
}
