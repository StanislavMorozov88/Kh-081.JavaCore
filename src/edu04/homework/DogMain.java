package edu04.homework;

public class DogMain {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Petro", Dog.Breed.SHEPHERD, 5),
        new Dog("Stepan", Dog.Breed.AKITA, 7),
        new Dog("Muhtar", Dog.Breed.MALAMUT, 9)};

        Dog.infoForDog(dogs);


    }
}
