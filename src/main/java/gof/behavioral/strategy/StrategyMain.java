package gof.behavioral.strategy;

import gof.behavioral.strategy.classes.Catalog;
import gof.behavioral.strategy.classes.CatalogNameSort;
import gof.behavioral.strategy.classes.CatalogPriceSort;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 17.11.2022 22:11
 * @class StrategyMain
 */
public class StrategyMain {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(new CatalogNameSort());

        catalog.sortProducts();
        System.out.println(catalog.getProducts());
        catalog.setStrategy(new CatalogPriceSort());
        catalog.sortProducts();
        System.out.println(catalog.getProducts());
    }
}
