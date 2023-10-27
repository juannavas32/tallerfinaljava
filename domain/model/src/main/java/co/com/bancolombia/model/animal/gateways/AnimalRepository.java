package co.com.bancolombia.model.animal.gateways;

import co.com.bancolombia.model.animal.Animal;

import java.util.List;

public interface AnimalRepository {

     void create(Animal animal);
     Animal read(String clase);

     void update(String clase, Animal animal) throws Exception;
     void delete(String clase);

    default List<Animal> getAll() {
        return null;
    }

}
