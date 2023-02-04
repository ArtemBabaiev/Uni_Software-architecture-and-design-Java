package gof.creational.prototype;

import gof.creational.prototype.classes.Category;
import gof.creational.prototype.classes.Product;

import java.util.Hashtable;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 16.09.2022 00:45
 * @class PrototypeMain
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Product product1 = new Product("111111111",
                "name1",
                "11111111", "desc1",
                11,
                11,
                11,
                new Hashtable<>(),
                new Category("categoryName"));
        Product product2 = product1.clone();
        product1.setName("UPD_NAME");
        System.out.println(product1);
        System.out.println(product2);
    }
}
