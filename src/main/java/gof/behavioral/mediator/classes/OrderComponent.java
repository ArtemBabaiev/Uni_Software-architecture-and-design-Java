package gof.behavioral.mediator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 11:50
 * @class OrderComponent
 */
public class OrderComponent extends IComponent {
    public void prepareOrder() {
        System.out.println("Preparing order");
        this.mediator.notify(Event.HANDLING);
    }

    public void fulfilOrderDB() {
        System.out.println("Order fulfilment");
    }
}
