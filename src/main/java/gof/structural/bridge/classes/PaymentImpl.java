package gof.structural.bridge.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:13
 * @class PaymentImpl
 */
public class PaymentImpl extends Payment {
    public PaymentImpl(PaymentMethod paymentMethod, String cardNumber, double price) {
        super(paymentMethod, cardNumber, price);
    }

    @Override
    public void commitPayment() {
        System.out.println("Payment commit");
        getPaymentMethod().pay(getCardNumber(), getPrice());
    }
}
