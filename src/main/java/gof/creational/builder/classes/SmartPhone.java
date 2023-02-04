package gof.creational.builder.classes;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 30.09.2022 04:18
 * @class SmartPhone
 */
public class SmartPhone {
    private int id;
    private String name;
    private String productNumber;
    private int ram;
    private String cpu;
    private String screen;

    public SmartPhone() {
    }

    public SmartPhone(int id, String name, String productNumber, int ram, String cpu, String screen) {
        this.id = id;
        this.name = name;
        this.productNumber = productNumber;
        this.ram = ram;
        this.cpu = cpu;
        this.screen = screen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
