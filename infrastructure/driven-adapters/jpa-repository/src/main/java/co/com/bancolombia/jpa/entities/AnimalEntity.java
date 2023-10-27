package co.com.bancolombia.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "animal")
public class AnimalEntity {
    @Id
    private String clase;
    @Column private String genero;
    @Column private Integer nroPatas;
    @Column private String habitat;
    @Column private Boolean domestico;

}
