package gof.behavioral.memento.classes;

import java.util.ArrayList;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 12:09
 * @class OrderCaretaker
 */
public class OrderCaretaker {
    ArrayList<Memento> mementos = new ArrayList<>();
    Order order;

    public OrderCaretaker(Order order) {
        this.order = order;
    }

    public void backup() {
        mementos.add(order.save());
    }

    public void undo() {
        mementos.remove(mementos.size() - 1);
    }

    public void showHistory() {
        mementos.forEach(System.out::println);
    }
}
