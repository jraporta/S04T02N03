package cat.itacademy.s04.t02.n03.controllers;

import cat.itacademy.s04.t02.n03.model.Fruit;
import cat.itacademy.s04.t02.n03.services.FruitService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fruit")
@RestController
public class FruitController {

    FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @ResponseBody
    @PostMapping("/add")
    public ResponseEntity<String> addFruit(@Valid @RequestBody Fruit fruit){
        Fruit addedFruit = fruitService.addFruit(fruit);
        return ResponseEntity.ok("Added fruit with id " + addedFruit.getId());
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateFruit(@Valid @RequestBody Fruit fruit){
        Fruit updatedFruit = fruitService.updateFruit(fruit);
        return ResponseEntity.ok("Updated fruit with id " + updatedFruit.getId());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable String id){
        fruitService.deleteFruitById(id);
        return ResponseEntity.ok("Deleted fruit with id " + id);
    }

    @GetMapping("/getOne/{id}")
    public Fruit getFruit(@PathVariable String id){
        return fruitService.getFruitById(id);
    }

    @ResponseBody
    @GetMapping("/getAll")
    public List<Fruit> getAllFruits(){
        return fruitService.getAllFruits();
    }

}
