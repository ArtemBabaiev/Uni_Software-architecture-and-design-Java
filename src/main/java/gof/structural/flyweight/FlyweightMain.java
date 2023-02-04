package gof.structural.flyweight;

import gof.structural.flyweight.classes.Phone;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 03:36
 * @class FlyweightMain
 */
public class FlyweightMain {
    public static void main(String[] args) {
        System.out.println(new Phone(1, "myPhone", 1));
    }
}
