package gof.behavioral.command.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:28
 * @class Order
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    String id;
    String number;
    double price;
}
