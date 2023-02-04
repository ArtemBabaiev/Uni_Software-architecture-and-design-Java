package gof.creational.factoryMethod.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 01:40
 * @class ComputerFactory
 */
public abstract class ComputerFactory {
    public abstract Computer getComputer(String ram, String hdd, String cpu);
}
