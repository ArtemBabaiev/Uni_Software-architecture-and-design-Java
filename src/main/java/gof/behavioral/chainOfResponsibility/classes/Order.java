package gof.behavioral.chainOfResponsibility.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:18
 * @class Order
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    CreditCard card;
    Product product;
}
