package gof.structural.facade.classes;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 00:41
 * @class Warehouse
 */
public class Warehouse {
    private List<Product> productList = Arrays.asList(
            new Product(1, "name1", 3, 15),
            new Product(2, "name2", 3, 15),
            new Product(3, "name3", 3, 15)
    );

    public Product getProduct(int id) {
        return productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }

    public void sellProduct(int id) {
        Objects.requireNonNull(productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null)).sell();
    }
}
