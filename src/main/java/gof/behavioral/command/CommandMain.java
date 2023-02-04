package gof.behavioral.command;

import gof.behavioral.command.classes.Order;
import gof.behavioral.command.classes.OrderDbCommand;
import gof.behavioral.command.classes.OrderPaymentCommand;
import gof.behavioral.command.classes.OrderService;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:21
 * @class CommandMain
 */
public class CommandMain {
    public static void main(String[] args) {
        Order order = new Order("1", "123", 153);
        Order order1 = new Order("2", "123", 153);
        OrderService orderService = new OrderService(new ArrayList<>(Arrays.asList(new OrderPaymentCommand(order, "4242 4242 4242 4242"), new OrderDbCommand(order))));
        orderService.addCommand(new OrderDbCommand(order1));
        orderService.executeCommands();
    }
}
