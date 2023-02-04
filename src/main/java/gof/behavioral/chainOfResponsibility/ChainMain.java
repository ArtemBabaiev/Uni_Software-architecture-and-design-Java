package gof.behavioral.chainOfResponsibility;

import gof.behavioral.chainOfResponsibility.classes.*;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:12
 * @class ChainMain
 */
public class ChainMain {
    public static void main(String[] args) {
        OrderPaymentHandler chain = new OrderPaymentHandler(new OrderDbHandler(null));

        chain.handle(
                new Order(
                        new CreditCard("4242 4242 4242 4242", "123"),
                        new Product(1, "name")
                )
        );
    }
}
