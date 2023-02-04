package grasp.informationExpert.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 21:57
 * @class Order
 */
@Data
@AllArgsConstructor
public class Order {
    List<Purchase> purchases;

    public double getCost() {
        double result = 0;
        for (Purchase purchase : purchases) {
            result += purchase.getCost();
        }
        return result;
    }
}
