package grasp.polymorphism;

import grasp.polymorphism.classes.Diary;
import grasp.polymorphism.classes.Product;
import grasp.polymorphism.classes.TechProduct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 23:22
 * @class PolyMain
 */
public class PolyMain {
    public static void main(String[] args) {
        //easy handling new variations .
        ArrayList<Product> products = new ArrayList<>(
                List.of(new Diary("a", 15, LocalDateTime.now()),
                        new TechProduct("t", 15, 18))
        );
        for (var product: products
             ) {
            System.out.println(product.getName());
        }
    }
}
