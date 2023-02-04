package gof.structural.facade.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 00:41
 * @class Product
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int quantity;
    private int price;

    public void sell() {
        quantity--;
    }
}
