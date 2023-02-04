package gof.behavioral.mediator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 04.11.2022 11:42
 * @class IComponent
 */
public abstract class IComponent {
    IMediator mediator;

    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }
}
