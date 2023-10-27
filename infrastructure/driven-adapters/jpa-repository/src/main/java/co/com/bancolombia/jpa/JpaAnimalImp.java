package co.com.bancolombia.jpa;

import co.com.bancolombia.model.animal.Animal;
import co.com.bancolombia.model.animal.gateways.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.List;

@Component
@AllArgsConstructor

public class JpaAnimalImp  implements AnimalRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;
    @Override
    public void create(Animal animal){
      jpaRepositoryAdapter.save(animal);
    }
    @Override
    public Animal read(String clase){
      return jpaRepositoryAdapter.findById(clase);
       }
    @Override
    public void update(String clase, Animal animal) throws Exception {
       Animal animalDb = jpaRepositoryAdapter.findById(clase) ;
        if(animalDb == null) {
         throw new Exception("Animal no Existe:" + clase);
        }
        animalDb.setGenero(animal.getGenero());
        animalDb.setDomestico(animal.getDomestico());
        animalDb.setClase(animal.getClase());
        animalDb.setNroPatas(animal.getNroPatas());
        animalDb.setHabitat(animal.getHabitat());
        jpaRepositoryAdapter.save(animalDb);
    }
    @Override
    public void delete(String clase) {
        jpaRepositoryAdapter.deleteById(clase);
    }

    @Override
    public List<Animal> getAll() {
       return jpaRepositoryAdapter.findAll();
    }
}
