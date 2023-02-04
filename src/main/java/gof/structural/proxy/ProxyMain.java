package gof.structural.proxy;

import gof.structural.proxy.Classes.CatalogHashProxy;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 01:45
 * @class ProxyMain
 */
public class ProxyMain {
    public static void main(String[] args) {
        CatalogHashProxy catalogHashProxy = new CatalogHashProxy();
        System.out.println(catalogHashProxy.getById(1));
        System.out.println(catalogHashProxy.getAll());

    }
}
