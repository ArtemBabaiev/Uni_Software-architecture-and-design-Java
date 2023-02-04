package gof.behavioral.memento;

import gof.behavioral.memento.classes.Order;
import gof.behavioral.memento.classes.OrderCaretaker;
import gof.behavioral.memento.classes.Product;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 12:02
 * @class MementoMain
 */
public class MementoMain {
    public static void main(String[] args) {
        Order order = new Order(new ArrayList<>(Arrays.asList(
                new Product(1, "name1", 11),
                new Product(1, "name1", 12),
                new Product(1, "name1", 13)
        )));
        OrderCaretaker caretaker = new OrderCaretaker(order);

        caretaker.backup();

        order.addProduct(new Product(9, "sdlajfsl", 99));

        caretaker.backup();

        caretaker.showHistory();
    }
}
