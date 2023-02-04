package gof.structural.composite.classes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:34
 * @class Food
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Food extends BaseProduct {
    private LocalDate expirationDate;

    public Food(String name, int quantity, double price, LocalDate expirationDate) {
        super(name, quantity, price);
        this.expirationDate = expirationDate;
    }
}
