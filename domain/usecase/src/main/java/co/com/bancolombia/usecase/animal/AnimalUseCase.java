package co.com.bancolombia.usecase.animal;

import co.com.bancolombia.model.animal.Animal;
import co.com.bancolombia.model.animal.gateways.AnimalRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class AnimalUseCase {

    private AnimalRepository animalRepository;

    public void create(Animal animal) {
            animalRepository.create(animal);
    }
    public Animal read(String clase) {
            return animalRepository.read(clase) ;
    }

    public void update(String clase,Animal animal) throws Exception {
             animalRepository.update(clase,animal);
    }

    public void delete(String clase) {
        animalRepository.delete(clase);
    }

    public List<Animal> getAll() {
        return animalRepository.getAll();
    }
}