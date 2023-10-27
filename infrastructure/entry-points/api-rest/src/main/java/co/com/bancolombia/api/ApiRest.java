package co.com.bancolombia.api;
import co.com.bancolombia.model.animal.Animal;
import co.com.bancolombia.usecase.animal.AnimalUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
//    private final MyUseCase useCase;
    private AnimalUseCase anim;

    @GetMapping(path = "/animales/{clase}")
    public Animal read(@PathVariable String clase){
        return anim.read(clase);
    }
    @PostMapping(path="/animales")
    public void create(@RequestBody Animal animal){
        anim.create(animal);
    }
    @PutMapping(path="/animales/{clase}")
    public void update(@PathVariable String clase, @RequestBody Animal animal) {
        try {
            anim.update(clase, animal);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
    @DeleteMapping(path = "/animales/{clase}")
    public void delete(@PathVariable String clase){
        anim.delete(clase);
    }
    @GetMapping(path = "/animales")
    public List<Animal> getAll() {
       return anim.getAll();
    }
}
