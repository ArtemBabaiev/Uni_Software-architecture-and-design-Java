package gof.behavioral.visitor.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 18.11.2022 00:44
 * @class Keyboard
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
