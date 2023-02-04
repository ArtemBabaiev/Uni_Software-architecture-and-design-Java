package grasp.polymorphism.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author Artem Babaiev
 * @version: 1.0.0
 * @project Patterns
 * @date 28.11.2022 23:35
 * @class Diary
 */
@Getter
@Setter
public class Diary extends Product{
    LocalDateTime expriationDate;

    public Diary(String name, double price, LocalDateTime expriationDate) {
        super(name, price);
        this.expriationDate = expriationDate;
    }
}
