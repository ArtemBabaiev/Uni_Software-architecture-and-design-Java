package gof.creational.singleton;

import gof.creational.singleton.classes.Catalog;
import gof.creational.singleton.classes.Category;
import gof.creational.singleton.classes.Product;

import java.util.Hashtable;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 15.09.2022 23:56
 * @class SingletonMain
 */
public class SingletonMain {
    public static void main(String[] args) {
        Thread runnable1 = new Thread(new Thread1());
        Thread runnable2 = new Thread(new Thread2());
        runnable1.start();
        runnable2.start();
    }

    static class Thread1 implements Runnable {

        @Override
        public void run() {
            Catalog catalog = Catalog.getInstance();
            catalog.addProduct(
                    new Product("111111111", "name1", "11111111", "desc1", 11, 11, 11, new Hashtable<>(),
                            new Category("categoryName"))
            );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            catalog.addProduct(
                    new Product("222222222222", "name1", "11111111", "desc1", 11, 11, 11, new Hashtable<>(),
                            new Category("categoryName"))
            );
            catalog.addProduct(
                    new Product("33333333333333", "name1", "11111111", "desc1", 11, 11, 11, new Hashtable<>(),
                            new Category("categoryName"))
            );
            catalog.addProduct(
                    new Product("44444444444", "name1", "11111111", "desc1", 11, 11, 11, new Hashtable<>(),
                            new Category("categoryName"))
            );
        }
    }

    static class Thread2 implements Runnable {

        @Override
        public void run() {
            Catalog catalog = Catalog.getInstance();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            catalog.showAll();
        }
    }
}
