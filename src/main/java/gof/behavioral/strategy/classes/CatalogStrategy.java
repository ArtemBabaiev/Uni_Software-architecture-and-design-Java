package gof.behavioral.strategy.classes;

import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 17.11.2022 22:43
 * @class CatalogStrategy
 */
public interface CatalogStrategy {
    void doSort(List<Product> productList);
}
