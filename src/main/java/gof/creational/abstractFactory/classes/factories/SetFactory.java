package gof.creational.abstractFactory.classes.factories;

import gof.creational.abstractFactory.classes.entities.Laptop;
import gof.creational.abstractFactory.classes.entities.Phone;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 02:29
 * @class SetFactory
 */
public abstract class SetFactory {
    public abstract Phone createPhone();

    public abstract Laptop createLaptop();
}
