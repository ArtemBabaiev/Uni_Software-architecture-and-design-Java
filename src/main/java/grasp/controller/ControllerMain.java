package grasp.controller;

import grasp.controller.classes.ProductController;
import grasp.controller.classes.ProductDb;
import grasp.controller.classes.PurchaseDb;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 22:41
 * @class ControllerMain
 */
public class ControllerMain {
    public static void main(String[] args) {
        /*Mediator або Facade+handling sequence of operations*/
        //receiving input and responding to events.
        //CQRS
        //The controller is responsible for handling multiple requests from the client.
        new ProductController(new ProductDb(), new PurchaseDb()).getMessage("REFUND");
    }
}
