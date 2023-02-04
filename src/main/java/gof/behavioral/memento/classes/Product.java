package gof.behavioral.memento.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 12:03
 * @class Product
 */
@Data
@AllArgsConstructor
public class Product {
    int id;
    String name;
    double price;
}
