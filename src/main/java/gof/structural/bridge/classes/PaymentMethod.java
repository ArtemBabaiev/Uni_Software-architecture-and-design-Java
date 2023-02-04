package gof.structural.bridge.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:05
 * @class PaymentMethod
 */
public interface PaymentMethod {
    public void pay(String card, double price);
}
