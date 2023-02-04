package gof.behavioral.chainOfResponsibility.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:15
 * @class IOrderHandler
 */
public interface IOrderHandler {
    IOrderHandler setNext(IOrderHandler next);

    void handle(Order order);
}
