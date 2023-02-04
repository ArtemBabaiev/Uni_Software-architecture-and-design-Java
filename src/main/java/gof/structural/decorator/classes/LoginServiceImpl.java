package gof.structural.decorator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 02:11
 * @class LoginServiceImpl
 */
public class LoginServiceImpl implements ILoginService {
    @Override
    public void login(String username, String password) {
        System.out.println("Login using -u:" + username + ", -p:" + password);
    }

    @Override
    public void logout() {
        System.out.println("Logout");
    }
}
