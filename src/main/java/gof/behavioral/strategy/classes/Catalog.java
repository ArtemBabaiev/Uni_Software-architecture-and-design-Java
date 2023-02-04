package gof.behavioral.strategy.classes;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 17.11.2022 21:54
 * @class Catalog
 */
@ToString
public class Catalog {
    ArrayList<Product> products;
    private CatalogStrategy strategy;

    public Catalog(CatalogStrategy strategy) {
        this.products = new ArrayList<>(
                List.of(
                        new Product("Name", 15.6),
                        new Product("Aljsdf", 99),
                        new Product("ZYX", 78)
                )
        );
        this.strategy = strategy;
    }

    public void setStrategy(CatalogStrategy strategy) {
        this.strategy = strategy;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void sortProducts() {
        strategy.doSort(products);
    }
}
