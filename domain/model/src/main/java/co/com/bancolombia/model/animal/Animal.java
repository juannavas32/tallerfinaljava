package co.com.bancolombia.model.animal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor

public class Animal {
    private String clase;
    private String genero;
    private Integer nroPatas;
    private String habitat;
    private Boolean domestico;

}
