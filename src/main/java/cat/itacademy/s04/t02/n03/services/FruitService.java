package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.model.Fruit;

import java.util.List;

public interface FruitService {
    Fruit addFruit(Fruit fruit);

    List<Fruit> getAllFruits();

    Fruit getFruitById(String id);

    void deleteFruitById(String id);

    Fruit updateFruit(Fruit fruit);
}
