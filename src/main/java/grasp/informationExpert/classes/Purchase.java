package grasp.informationExpert.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 22:01
 * @class Purchase
 */
@Data
@AllArgsConstructor
public class Purchase {
    Product product;
    int amount;

    public double getCost() {
        return product.getPrice() * amount;
    }
}
