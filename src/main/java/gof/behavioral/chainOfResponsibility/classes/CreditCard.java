package gof.behavioral.chainOfResponsibility.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 21.10.2022 02:17
 * @class CreditCard
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCard {
    String number;
    String csv;
}
