package gof.behavioral.iterator.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 05:11
 * @class ProductIterator
 */
class ProductIterator implements IIterator {
    int index;
    Catalog catalog;

    public ProductIterator(Catalog catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if (index < catalog.products.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Product getNext() {
        if (this.hasNext()) {
            return catalog.products.get(index++);
        }
        return null;
    }
}
