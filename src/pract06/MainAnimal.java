package pract06;

public class MainAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Whitey", "fish", 5.3);
        animals[1] = new Cat("Blacky", "tuna", 6.5);
        animals[2] = new Dog("Harley", "chicken", 7.3);
        animals[3] = new Dog("Lord", "duck", 26.6);
        animals[4] = new Dog("Leya", "rabbit", 5.3);

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }

    }
}
