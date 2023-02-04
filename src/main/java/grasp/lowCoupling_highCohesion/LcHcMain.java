package grasp.lowCoupling_highCohesion;

import grasp.lowCoupling_highCohesion.classes.Profile;
import grasp.lowCoupling_highCohesion.classes.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 22:25
 * @class LcHcMain
 */
public class LcHcMain {
    public static void main(String[] args) {
        //LowCoupling create as fewer connections between our classes, modules, files, etc… as possible.
        //High Cohesion: Single Responsibility
        //class should have the logic, that does only one well-defined job, and if it’s not,
        // we should separate our classes thereby creating new connections between classes.
        Profile profile = new Profile(
                new User("jsdflakf"),
                new ArrayList<>()
        );
    }
}
