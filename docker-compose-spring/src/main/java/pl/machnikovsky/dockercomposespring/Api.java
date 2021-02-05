package pl.machnikovsky.dockercomposespring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Api {

    private AnimalRepo animalRepo;

    @Autowired
    public Api(AnimalRepo animalRepo) {
        this.animalRepo = animalRepo;
        animalRepo.save(new Animal("Dog"));
    }


    @GetMapping("/animals")
    public Iterable<Animal> getAnimals() {
        return animalRepo.findAll();
    }

    @PostMapping("/animals")
    public void addAnimals(@RequestBody Animal animal) {
        animalRepo.save(animal);
    }

}
