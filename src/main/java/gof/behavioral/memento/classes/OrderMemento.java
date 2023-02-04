package gof.behavioral.memento.classes;

import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 12:07
 * @class OrderMemento
 */
@ToString
public class OrderMemento implements Memento {
    List<Product> products;
    LocalDateTime createAt;

    public OrderMemento(List<Product> products) {
        this.products = products;
        createAt = LocalDateTime.now();
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
