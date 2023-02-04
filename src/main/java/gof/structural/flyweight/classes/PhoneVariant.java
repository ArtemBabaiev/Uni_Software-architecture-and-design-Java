package gof.structural.flyweight.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 14.10.2022 03:37
 * @class PhoneVariant
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneVariant {
    private int id;
    private String manufacturer;
    private String model;
}
