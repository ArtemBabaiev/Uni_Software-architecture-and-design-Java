package gof.structural.flyweight.classes;

import lombok.Data;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 03:37
 * @class Phone
 */
@Data
public class Phone {
    int id;
    String name;
    PhoneVariant variant;

    public Phone(int id, String name, int variantId) {
        this.id = id;
        this.name = name;
        this.variant = VariantsStorage.getVariant(variantId);
    }
}
