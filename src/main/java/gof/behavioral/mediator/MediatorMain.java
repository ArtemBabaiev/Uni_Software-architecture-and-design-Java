package gof.behavioral.mediator;

import gof.behavioral.mediator.classes.OrderComponent;
import gof.behavioral.mediator.classes.OrderMediator;
import gof.behavioral.mediator.classes.PaymentSession;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 11:41
 * @class MediatorMain
 */
public class MediatorMain {
    public static void main(String[] args) {
        OrderComponent orderComponent = new OrderComponent();
        PaymentSession session = new PaymentSession();
        OrderMediator mediator = new OrderMediator(session, orderComponent);

        session.openSession();
    }
}
