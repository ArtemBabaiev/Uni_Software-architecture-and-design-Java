package gof.behavioral.visitor.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 18.11.2022 00:50
 * @class ComputerPartVisitor
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
