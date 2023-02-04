package gof.behavioral.mediator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 11:43
 * @class OrderMediator
 */
public class OrderMediator implements IMediator {

    PaymentSession session;
    OrderComponent orderComponent;

    public OrderMediator(PaymentSession session, OrderComponent orderComponent) {
        this.session = session;
        this.orderComponent = orderComponent;
        this.session.setMediator(this);
        this.orderComponent.setMediator(this);
    }

    public void openSession() {
        System.out.println("Mediator opening session");
    }

    @Override
    public void notify(Event event) {
        switch (event) {
            case OPEN -> {
                orderComponent.prepareOrder();
            }
            case HANDLING -> {
                session.handle();
            }
            case CLOSE -> {
                session.closeSession();
                orderComponent.fulfilOrderDB();
            }
        }
    }
}
