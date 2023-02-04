package gof.creational.singleton.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 15.09.2022 23:58
 * @class Category
 */
public class Category {
    public String name;

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
