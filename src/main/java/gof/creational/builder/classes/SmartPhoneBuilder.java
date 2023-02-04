package gof.creational.builder.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 30.09.2022 04:20
 * @class SmartPhoneBuilder
 */
public class SmartPhoneBuilder {
    private int id;
    private String name;
    private String productNumber;
    private int ram;
    private String cpu;
    private String screen;

    public SmartPhoneBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public SmartPhoneBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public SmartPhoneBuilder withProductNumber(String productNumber) {
        this.productNumber = productNumber;
        return this;
    }

    public SmartPhoneBuilder withRam(int ram) {
        this.ram = ram;
        return this;
    }

    public SmartPhoneBuilder withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public SmartPhoneBuilder withScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public SmartPhone build() {
        return new SmartPhone(id, name, productNumber, ram, cpu, screen);
    }
}
