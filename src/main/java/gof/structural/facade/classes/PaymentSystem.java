package gof.structural.facade.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 00:41
 * @class PaymentSystem
 */
public class PaymentSystem {
    public void pay(int charge) {
        System.out.println("payment charge: " + charge);
    }
}
