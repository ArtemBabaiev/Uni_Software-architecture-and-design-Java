package gof.structural.composite;

import gof.structural.composite.classes.CompositeProduct;
import gof.structural.composite.classes.Food;
import gof.structural.composite.classes.Phone;

import java.time.LocalDate;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:25
 * @class CompositeMain
 */
public class CompositeMain {
    public static void main(String[] args) {
        CompositeProduct compositeProduct = new CompositeProduct(
                new Food("food", 5, 15.5, LocalDate.now()),
                new Phone("phone", 6, 15.5, "i5 7200u")
        );
        System.out.println(compositeProduct);
        compositeProduct.sell();
        System.out.println(compositeProduct);
        System.out.println(compositeProduct.price());
    }
}
