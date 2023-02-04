package gof.creational.abstractFactory.classes.factories;


import gof.creational.abstractFactory.classes.entities.AppleLaptop;
import gof.creational.abstractFactory.classes.entities.ApplePhone;
import gof.creational.abstractFactory.classes.entities.Laptop;
import gof.creational.abstractFactory.classes.entities.Phone;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 02:35
 * @class AppleSetFactory
 */
public class AppleSetFactory extends SetFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }
}
