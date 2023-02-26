package lesson04.hometasks;

public class DogMain {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog("Sam", Dog.Breed.POMERANIAN, 1),
                new Dog("Python", Dog.Breed.BULLDOG, 10),
                new Dog("Python", Dog.Breed.POODLE, 3)};

        Dog.infoForDog(dogs);
    }
}
