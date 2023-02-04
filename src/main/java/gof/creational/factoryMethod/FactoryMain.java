package gof.creational.factoryMethod;

import gof.creational.factoryMethod.classes.Computer;
import gof.creational.factoryMethod.classes.ComputerFactory;
import gof.creational.factoryMethod.classes.LaptopFactory;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 00:27
 * @class FactoryMain
 */
public class FactoryMain {
    public static void main(String[] args) {
        ComputerFactory factory = new LaptopFactory();
        Computer computer = factory.getComputer("8GB", "1TB", "i5 7200U");
        System.out.println(computer);
    }
}
