package gof.structural.composite.classes;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 07.10.2022 01:40
 * @class CompositeProduct
 */
@ToString
public class CompositeProduct implements IProduct {
    protected List<IProduct> children = new ArrayList<>();

    public CompositeProduct(IProduct... components) {
        addAll(components);
    }

    @Override
    public void sell() {
        children.stream().forEach(IProduct::sell);
    }

    @Override
    public void add() {
        children.stream().forEach(IProduct::add);
    }

    public void addAll(IProduct... products) {
        children.addAll(List.of(products));
    }

    @Override
    public double price() {
        return children.stream().mapToDouble(IProduct::price).sum();
    }
}
