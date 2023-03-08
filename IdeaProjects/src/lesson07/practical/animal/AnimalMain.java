package lesson07.practical.animal;

import lesson06.practical.lines.Point;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        animalService.add(new Cat("Charly", 5));
        animalService.add(new Dog("Python", 1));
        animalService.add(new Cat("Snoopy", 3));
        animalService.add(new Dog("Belka", 5));
        animalService.animalsVoice();
        animalService.animalsFeed();
        animalService.printAnimals();
    }
}
