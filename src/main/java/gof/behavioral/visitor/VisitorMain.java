package gof.behavioral.visitor;

import gof.behavioral.visitor.classes.Computer;
import gof.behavioral.visitor.classes.ComputerPart;
import gof.behavioral.visitor.classes.ComputerPartVisitorImpl;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 18.11.2022 00:44
 * @class VisitorMain
 */
public class VisitorMain {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartVisitorImpl());
    }
}
