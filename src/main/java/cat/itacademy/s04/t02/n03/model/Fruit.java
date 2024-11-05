package cat.itacademy.s04.t02.n03.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Fruit {

    @Id
    private String id;

    @NotBlank(message = "name is a required field")
    private String name;

    @NotNull(message = "quantity is a required field")
    @PositiveOrZero(message = "quantity can't be negative")
    private Double quantityKilograms;

}
