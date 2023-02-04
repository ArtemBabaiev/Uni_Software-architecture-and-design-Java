package grasp.controller.classes;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 23:03
 * @class ProductController
 */
public class ProductController {
    ProductDb productDb;
    PurchaseDb purchaseDb;

    public ProductController(ProductDb productDb, PurchaseDb purchaseDb) {
        this.productDb = productDb;
        this.purchaseDb = purchaseDb;
    }

    public void getMessage(String message){
        switch (message) {
            case "REFUND" -> {
                productDb.refund();
                purchaseDb.refund();
            }
            case "BUY" -> {
                productDb.buy();
                purchaseDb.buy();
            }
            default -> System.out.println("No option");
        }
    }
}
