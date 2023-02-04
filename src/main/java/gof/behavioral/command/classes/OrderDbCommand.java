package gof.behavioral.command.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:28
 * @class OrderDbCommand
 */
@Data
@AllArgsConstructor
public class OrderDbCommand implements ICommand {
    static ArrayList<Order> db = new ArrayList<>();
    Order order;

    @Override
    public void execute() {
        db.add(order);
        System.out.println(db);
    }
}
