package gof.structural.facade;

import gof.structural.facade.classes.ShopFacade;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 00:38
 * @class FacadeMain
 */
public class FacadeMain {
    public static void main(String[] args) {
        ShopFacade shopFacade = new ShopFacade();
        System.out.println(shopFacade.getProduct(2));
        shopFacade.buy(2);
        System.out.println(shopFacade.getProduct(2));
    }
}
