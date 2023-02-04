package gof.behavioral.observer;

import gof.behavioral.observer.classes.Product;
import gof.behavioral.observer.classes.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 10.11.2022 23:43
 * @class ObserverMain
 */
public class ObserverMain {
    public static void main(String[] args) {

        var product = new Product(1, "name", 0, new ArrayList<>(
                List.of(
                        new User("user1"),
                        new User("user2"),
                        new User("user3")
                )
        ));
        product.setQuantity(5);
    }
}
