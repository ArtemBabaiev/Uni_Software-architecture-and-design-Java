package gof.behavioral.observer.classes;

import lombok.AllArgsConstructor;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 10.11.2022 23:43
 * @class Product
 */
@AllArgsConstructor
public class Product {
    int id;
    String name;
    int quantity;
    List<ProductListener> users;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifySubscribers();
    }

    public void subscribe(ProductListener listener) {
        users.add(listener);
    }

    public void unsubscribe(ProductListener listener) {
        users.remove(listener);
    }

    public void notifySubscribers() {
        for (var listener :
                users) {
            listener.handleEvent("Product in stock");
        }
    }
}
