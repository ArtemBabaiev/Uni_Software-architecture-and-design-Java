package gof.structural.facade.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 00:41
 * @class ShopFacade
 */
public class ShopFacade {
    private Warehouse warehouse;
    private PaymentSystem paymentSystem;

    public ShopFacade() {
        this.warehouse = new Warehouse();
        this.paymentSystem = new PaymentSystem();
    }

    public Product getProduct(int id) {
        return warehouse.getProduct(id);
    }

    public boolean buy(int id) {
        try {
            int price = getProduct(id).getPrice();
            warehouse.sellProduct(id);
            paymentSystem.pay(price);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
