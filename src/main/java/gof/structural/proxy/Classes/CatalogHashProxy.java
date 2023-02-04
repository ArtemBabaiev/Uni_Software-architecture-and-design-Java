package gof.structural.proxy.Classes;

import java.util.HashMap;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:04
 * @class CatalogHashProxy
 */
public class CatalogHashProxy implements ICatalog {
    HashMap<Integer, Product> productHashMap;
    CatalogDB catalogDB;

    public CatalogHashProxy() {
        productHashMap = new HashMap<>();
        catalogDB = new CatalogDB();
    }

    @Override
    public HashMap<Integer, Product> getAll() {
        if (productHashMap.isEmpty()) {
            System.out.println("getting all from db");
            productHashMap = catalogDB.getAll();
        }
        System.out.println("All hash");
        return productHashMap;
    }

    @Override
    public Product getById(int id) {
        Product result = productHashMap.get(id);
        if (result == null) {
            System.out.println("getting by id from db");
            result = catalogDB.getById(id);
            productHashMap.put(result.getId(), result);
        }
        System.out.println("id hash");
        return result;
    }
}
