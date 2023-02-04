package gof.structural.proxy.Classes;

import java.util.HashMap;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 01:54
 * @class ICatalog
 */
public interface ICatalog {

    public HashMap<Integer, Product> getAll();

    public Product getById(int id);
}
