package gof.behavioral.iterator;

import gof.behavioral.iterator.classes.Catalog;
import gof.behavioral.iterator.classes.IIterator;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:49
 * @class IteratorMain
 */
public class IteratorMain {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        for (IIterator iter = catalog.getIterator(); iter.hasNext(); ) {
            System.out.println(iter.getNext());
        }
    }
}
