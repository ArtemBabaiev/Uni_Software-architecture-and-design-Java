package gof.structural.proxy.Classes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 01:58
 * @class CatalogDB
 */
public class CatalogDB implements ICatalog {
    List<Product> products = Arrays.asList(
            new Product(1, "name1"),
            new Product(2, "name2"),
            new Product(3, "name5"),
            new Product(4, "name4")
    );

    @Override
    public HashMap<Integer, Product> getAll() {
        return (HashMap<Integer, Product>) products.stream().collect(Collectors.toMap(Product::getId, Function.identity()));
    }

    @Override
    public Product getById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
