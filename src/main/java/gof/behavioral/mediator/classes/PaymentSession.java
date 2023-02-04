package gof.behavioral.mediator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 11:41
 * @class PaymentSession
 */
public class PaymentSession extends IComponent {
    public void openSession() {
        System.out.println("PaymentSession open");
        this.mediator.notify(Event.OPEN);
    }

    public void handle() {
        System.out.println("payment handled");
        this.mediator.notify(Event.CLOSE);
    }

    public void closeSession() {
        System.out.println("PaymentSession closed");
    }
}
