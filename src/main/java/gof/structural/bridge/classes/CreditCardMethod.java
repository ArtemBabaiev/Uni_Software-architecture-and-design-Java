package gof.structural.bridge.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:09
 * @class CreditCardMethod
 */
public class CreditCardMethod implements PaymentMethod {
    @Override
    public void pay(String card, double price) {
        System.out.println("Credit card payment using card: " + card + " price: " + price);
    }
}
