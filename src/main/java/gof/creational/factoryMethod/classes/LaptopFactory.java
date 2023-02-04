package gof.creational.factoryMethod.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 02:05
 * @class LaptopFactory
 */
public class LaptopFactory extends ComputerFactory {
    @Override
    public Computer getComputer(String ram, String hdd, String cpu) {
        return new Laptop(ram, hdd, cpu);
    }
}
