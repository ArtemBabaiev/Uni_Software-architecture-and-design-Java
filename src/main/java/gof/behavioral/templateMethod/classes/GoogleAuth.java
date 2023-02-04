package gof.behavioral.templateMethod.classes;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 18.11.2022 00:14
 * @class GoogleAuth
 */
public class GoogleAuth extends ServiceAuth {
    @Override
    public boolean tryConnect() {
        return new Random().nextBoolean();
    }

    @Override
    public List<String> requestData() {
        return List.of(UUID.randomUUID().toString(), UUID.randomUUID().toString());
    }
}
