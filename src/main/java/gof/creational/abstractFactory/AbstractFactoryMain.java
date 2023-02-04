package gof.creational.abstractFactory;

import gof.creational.abstractFactory.classes.TechSet;
import gof.creational.abstractFactory.classes.factories.AppleSetFactory;
import gof.creational.abstractFactory.classes.factories.SamsungSetFactory;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 02:12
 * @class AbstractFactoryMain
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        TechSet appleSet = new TechSet(new AppleSetFactory());
        System.out.println(appleSet);
        TechSet samsungSet = new TechSet(new SamsungSetFactory());
        System.out.println(samsungSet);
    }
}
