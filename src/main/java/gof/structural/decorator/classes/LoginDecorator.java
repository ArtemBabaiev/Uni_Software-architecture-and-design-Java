package gof.structural.decorator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 02:13
 * @class LoginDecorator
 */
public class LoginDecorator implements ILoginService {
    private ILoginService loginService;

    public LoginDecorator(ILoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public void login(String username, String password) {
        loginService.login(username, password);
    }

    @Override
    public void logout() {
        loginService.logout();
    }
}
