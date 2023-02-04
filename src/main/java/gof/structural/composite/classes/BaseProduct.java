package gof.structural.composite.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:29
 * @class BaseProduct
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseProduct implements IProduct {
    public String name;
    public int quantity;
    public double price;

    @Override
    public void sell() {
        System.out.println("Sold one " + this.getClass().getSimpleName());
        quantity--;
    }

    @Override
    public void add() {
        System.out.println("Added one " + this.getClass().getSimpleName());
        quantity++;
    }

    @Override
    public double price() {
        return price;
    }
}
