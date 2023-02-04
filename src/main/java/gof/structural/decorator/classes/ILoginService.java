package gof.structural.decorator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 02:10
 * @class ILoginService
 */
public interface ILoginService {
    public void login(String username, String password);

    public void logout();
}
