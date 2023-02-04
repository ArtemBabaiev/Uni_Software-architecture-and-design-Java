package gof.behavioral.command.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 28.10.2022 04:34
 * @class OrderService
 */
@Data
@AllArgsConstructor
public class OrderService {
    ArrayList<ICommand> commands;

    public void executeCommands() {
        for (ICommand command :
                commands) {
            command.execute();
        }
    }

    public void addCommand(ICommand command) {
        commands.add(command);
    }
}
