package gof.structural.bridge.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:04
 * @class Payment
 */

@Data
@AllArgsConstructor
public abstract class Payment {
    private PaymentMethod paymentMethod;
    private String cardNumber;
    private double price;

    public abstract void commitPayment();
}
