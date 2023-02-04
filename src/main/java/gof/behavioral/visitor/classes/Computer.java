package gof.behavioral.visitor.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 18.11.2022 00:49
 * @class Computer
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
