package grasp.polymorphism.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 23:37
 * @class TechProduct
 */
@Getter
@Setter
public class TechProduct extends Product{
    int warrantyInMonth;

    public TechProduct(String name, double price, int warrantyInMonth) {
        super(name, price);
        this.warrantyInMonth = warrantyInMonth;
    }
}
