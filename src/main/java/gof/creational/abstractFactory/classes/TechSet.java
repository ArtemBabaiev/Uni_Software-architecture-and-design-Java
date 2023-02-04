package gof.creational.abstractFactory.classes;

import gof.creational.abstractFactory.classes.entities.Laptop;
import gof.creational.abstractFactory.classes.entities.Phone;
import gof.creational.abstractFactory.classes.factories.SetFactory;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 02:27
 * @class TechSet
 */
public class TechSet {
    Phone phone;
    Laptop laptop;

    public TechSet(SetFactory setFactory) {
        phone = setFactory.createPhone();
        laptop = setFactory.createLaptop();
    }

    @Override
    public String toString() {
        return "TechSet{" +
                "phone=" + phone +
                ", laptop=" + laptop +
                '}';
    }
}
