package gof.behavioral.chainOfResponsibility.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:50
 * @class OrderDbHandler
 */
public class OrderDbHandler extends AbstractOrderHandler {

    public OrderDbHandler(IOrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Order order) {
        System.out.println("Order added to DB for product = " + order.getProduct());
        if (getNextHandler() != null) {
            getNextHandler().handle(order);
        }
    }
}
