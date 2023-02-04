package gof.behavioral.iterator.classes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 05:02
 * @class Catalog
 */
public class Catalog implements ICatalog {
    ArrayList<Product> products = new ArrayList<>(Arrays.asList(
            new Product("1", "name1"),
            new Product("2", "name2"),
            new Product("3", "name3")
    ));


    @Override
    public IIterator getIterator() {
        return new ProductIterator(this);
    }
}
