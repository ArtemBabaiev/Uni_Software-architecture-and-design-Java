package gof.creational.prototype.classes;

import java.time.LocalDateTime;
import java.util.Dictionary;
import java.util.Objects;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 15.09.2022 23:58
 * @class IProduct
 */
public class Product {
    private String id;
    private String name;
    private String product_number;
    private String description;
    private float price;
    private int stock_quantity;
    private int sold_quantity;
    private Dictionary<String, String> characteristic;
    private Category category;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public Product(String id, String name, String product_number, String description, float price, int stock_quantity,
                   int sold_quantity, Dictionary<String, String> characteristic, Category category) {
        this.id = id;
        this.name = name;
        this.product_number = product_number;
        this.description = description;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.sold_quantity = sold_quantity;
        this.characteristic = characteristic;
        this.category = category;
        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
    }

    public Product(Product product) {
        if (product != null) {
            this.id = product.id;
            this.name = product.name;
            this.product_number = product.product_number;
            this.description = product.description;
            this.price = product.price;
            this.stock_quantity = product.stock_quantity;
            this.sold_quantity = product.sold_quantity;
            this.characteristic = product.characteristic;
            this.category = product.category;
            this.created_at = product.created_at;
            this.updated_at = product.updated_at;
        }
    }

    public Product clone() {
        return new Product(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "IProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", product_number='" + product_number + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock_quantity=" + stock_quantity +
                ", sold_quantity=" + sold_quantity +
                ", characteristic=" + characteristic +
                ", category=" + category +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct_number() {
        return product_number;
    }

    public void setProduct_number(String product_number) {
        this.product_number = product_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public int getSold_quantity() {
        return sold_quantity;
    }

    public void setSold_quantity(int sold_quantity) {
        this.sold_quantity = sold_quantity;
    }

    public Dictionary<String, String> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Dictionary<String, String> characteristic) {
        this.characteristic = characteristic;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
