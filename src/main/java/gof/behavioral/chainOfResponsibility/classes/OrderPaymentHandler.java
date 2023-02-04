package gof.behavioral.chainOfResponsibility.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:53
 * @class OrderPaymentHandler
 */
public class OrderPaymentHandler extends AbstractOrderHandler {
    public OrderPaymentHandler(IOrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Order order) {
        System.out.println("Order payment accepted with card = " + order.getCard());
        if (getNextHandler() != null) {
            getNextHandler().handle(order);
        }
    }
}
