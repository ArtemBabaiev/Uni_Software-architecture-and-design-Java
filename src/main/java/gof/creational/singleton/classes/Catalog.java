package gof.creational.singleton.classes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 15.09.2022 23:58
 * @class Catalog
 */
public class Catalog {
    private static Catalog instance;

    private Set<Product> products;

    private Catalog() {
        this.products = new HashSet<>();
    }

    public static Catalog getInstance() {
        Catalog result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Catalog.class) {
            if (instance == null) {
                System.out.println("New instance crated");
                instance = new Catalog();
            }
            return instance;
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteById(String id) {
        products.remove(id);
    }

    public void showAll() {
        Arrays.asList(products).forEach(System.out::println);
    }

}
