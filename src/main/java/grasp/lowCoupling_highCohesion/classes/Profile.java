package grasp.lowCoupling_highCohesion.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 22:29
 * @class Profile
 */
@Data
@AllArgsConstructor
public class Profile {
    User user;
    ArrayList<Product> products;

    //логіка
}
