package grasp.informationExpert.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 21:57
 * @class Product
 */
@Data
@AllArgsConstructor
public class Product {
    private String name;
    private double price;
}
