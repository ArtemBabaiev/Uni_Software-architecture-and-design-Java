package gof.structural.bridge.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:19
 * @class EWalletMethod
 */
public class EWalletMethod implements PaymentMethod {
    @Override
    public void pay(String account, double price) {
        System.out.println("E wallet payment using card: " + account + " price: " + price);
    }
}
