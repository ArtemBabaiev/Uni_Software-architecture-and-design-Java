package gof.structural.decorator;

import gof.structural.decorator.classes.EncryptionLoginDecorator;
import gof.structural.decorator.classes.LoginDecorator;
import gof.structural.decorator.classes.LoginServiceImpl;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 02:09
 * @class DecoratorMain
 */
public class DecoratorMain {
    public static void main(String[] args) {
        EncryptionLoginDecorator decorator = new EncryptionLoginDecorator(
                new LoginDecorator(
                        new LoginServiceImpl()));

        decorator.login("admin", "password");

    }
}
