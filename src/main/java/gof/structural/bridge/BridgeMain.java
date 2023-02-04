package gof.structural.bridge;

import gof.structural.bridge.classes.CreditCardMethod;
import gof.structural.bridge.classes.EWalletMethod;
import gof.structural.bridge.classes.PaymentImpl;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 00:50
 * @class BridgeMain
 */
public class BridgeMain {
    public static void main(String[] args) {
        var payment1 = new PaymentImpl(new CreditCardMethod(), "424242424242424", 156);
        var payment2 = new PaymentImpl(new EWalletMethod(), "123456789", 156);

        payment1.commitPayment();
        payment2.commitPayment();
    }
}
