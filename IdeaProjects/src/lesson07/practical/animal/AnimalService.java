package lesson07.practical.animal;

import java.util.Arrays;

public class AnimalService {
    Animal[] animals;
    private int index;

    public AnimalService() {
        animals = new Animal[3];
        index = -1;
    }

    public boolean add(Animal animal) {
        if (index == animals.length - 1) {
            animals = Arrays.copyOf(animals, animals.length * 2);
        }
        animals[++index] = animal;
        return true;
    }

    public void animalsVoice() {
        checkIndex();
        for (int i = 0; i <= index; i++) {
            animals[i].voice();
        }
    }

    public void animalsFeed() {
        checkIndex();
        for (int i = 0; i <= index; i++) {
            animals[i].feed();
        }
    }

    private void checkIndex() {
        if (index < 0) {
            System.out.println("There are no animals in List");
        }
    }

    public void printAnimals() {
        for (int i = 0; i <= index; i++) {
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Animals: ");
        for (int i = 0; i <= animals.length; i++) {
            sb.append(animals[i] + ", ");
        }
        return sb.toString();
    }
}
