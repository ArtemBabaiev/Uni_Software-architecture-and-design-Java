package gof.behavioral.memento.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 12:03
 * @class Order
 */
@Data
@AllArgsConstructor
public class Order {
    ArrayList<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }

    public Memento save() {
        return new OrderMemento(new ArrayList<>(List.copyOf(products)));
    }
}
