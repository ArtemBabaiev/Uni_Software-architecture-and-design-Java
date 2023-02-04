package grasp.informationExpert;

import grasp.informationExpert.classes.Order;
import grasp.informationExpert.classes.Product;
import grasp.informationExpert.classes.Purchase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 21:55
 * @class InfExpertMain
 */
public class InfExpertMain {
    public static void main(String[] args) {
        // that in our system, we should create as fewer connections between
        // our classes, modules, files, etc… as possible.
        Order order = new Order(
                new ArrayList<>(
                        List.of(
                                new Purchase(new Product("a", 15.0), 5),
                                new Purchase(new Product("b", 15.0), 5)
                        )
                )
        );
        System.out.println(order.getCost());
    }
}
