package gof.behavioral.observer.classes;

import java.util.EventListener;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 10.11.2022 23:52
 * @class ProductListener
 */
public interface ProductListener extends EventListener {
    void handleEvent(String message);
}
