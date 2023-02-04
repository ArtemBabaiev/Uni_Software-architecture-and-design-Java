package gof.behavioral.command.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:31
 * @class OrderPaymentCommand
 */
@Data
@AllArgsConstructor
public class OrderPaymentCommand implements ICommand {
    Order order;
    String cardNumber;

    @Override
    public void execute() {
        System.out.println("Payment with card=" + cardNumber + " for order" + order);
    }
}
