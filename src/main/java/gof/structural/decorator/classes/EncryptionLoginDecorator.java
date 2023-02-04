package gof.structural.decorator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 02:15
 * @class EncryptionLoginDecorator
 */
public class EncryptionLoginDecorator extends LoginDecorator {
    public EncryptionLoginDecorator(ILoginService loginService) {
        super(loginService);
    }

    @Override
    public void login(String username, String password) {
        super.login(username, String.valueOf(password.hashCode()));
    }

    @Override
    public void logout() {
        super.logout();
    }
}
