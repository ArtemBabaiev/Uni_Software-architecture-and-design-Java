package gof.structural.composite.classes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:34
 * @class Phone
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Phone extends BaseProduct {
    private String cpu;

    public Phone(String name, int quantity, double price, String cpu) {
        super(name, quantity, price);
        this.cpu = cpu;
    }
}
