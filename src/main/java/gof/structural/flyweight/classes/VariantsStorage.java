package gof.structural.flyweight.classes;

import java.util.Arrays;
import java.util.List;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 03:37
 * @class VariantsStorage
 */
public class VariantsStorage {
    private static List<PhoneVariant> variants = Arrays.asList(
            new PhoneVariant(1, "Apple", "Pro"),
            new PhoneVariant(2, "Samsung", "Lite"),
            new PhoneVariant(3, "Xiaomi", "Standard")
    );

    public static PhoneVariant getVariant(int id) {
        return variants.stream().filter(vari -> vari.getId() == id).findFirst().orElse(null);
    }

}
