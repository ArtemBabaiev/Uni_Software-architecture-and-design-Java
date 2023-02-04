package gof.creational.abstractFactory.classes.factories;

import gof.creational.abstractFactory.classes.entities.Laptop;
import gof.creational.abstractFactory.classes.entities.Phone;
import gof.creational.abstractFactory.classes.entities.SamsungLaptop;
import gof.creational.abstractFactory.classes.entities.SamsungPhone;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 02:37
 * @class SamsungSetFactory
 */
public class SamsungSetFactory extends SetFactory {
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
