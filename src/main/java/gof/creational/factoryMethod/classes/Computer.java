package gof.creational.factoryMethod.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 23.09.2022 01:37
 * @class Computer
 */
public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
