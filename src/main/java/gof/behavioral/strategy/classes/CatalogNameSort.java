package gof.behavioral.strategy.classes;

import java.util.Comparator;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 17.11.2022 22:49
 * @class CatalogNameSort
 */
public class CatalogNameSort implements CatalogStrategy {
    @Override
    public void doSort(List<Product> productList) {
        productList.sort(Comparator.comparing(Product::getName));
    }
}
