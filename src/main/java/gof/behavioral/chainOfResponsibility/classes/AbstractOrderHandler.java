package gof.behavioral.chainOfResponsibility.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:44
 * @class AbstractOrderHandler
 */
public class AbstractOrderHandler implements IOrderHandler {
    private IOrderHandler nextHandler;

    public AbstractOrderHandler(IOrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public IOrderHandler setNext(IOrderHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public IOrderHandler getNextHandler() {
        return nextHandler;
    }

    @Override
    public void handle(Order order) {
        System.out.println("Base handling");
        if (nextHandler != null) {
            nextHandler.handle(order);
        }
    }
}
