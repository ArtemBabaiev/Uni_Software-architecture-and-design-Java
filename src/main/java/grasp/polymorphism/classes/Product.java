package grasp.polymorphism.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 23:24
 * @class Product
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    String name;
    double price;
}
