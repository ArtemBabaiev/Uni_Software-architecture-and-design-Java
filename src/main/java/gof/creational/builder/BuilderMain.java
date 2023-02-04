package gof.creational.builder;

import gof.creational.builder.classes.SmartPhone;
import gof.creational.builder.classes.SmartPhoneBuilder;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 30.09.2022 04:14
 * @class BuilderMain
 */
public class BuilderMain {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhoneBuilder()
                .withId(1)
                .withName("Name")
                .withCpu("i5 7200U")
                .withRam(16)
                .withScreen("1920*1080")
                .withProductNumber("123456789").build();
        System.out.println(phone);
    }


}
