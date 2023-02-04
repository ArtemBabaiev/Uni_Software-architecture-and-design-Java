package gof.behavioral.visitor.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 18.11.2022 00:44
 * @class ComputerPart
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
