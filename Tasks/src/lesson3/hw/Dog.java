package lesson3.hw;


//  2. Сreate class Dog with fields name, breed, age
//        • Declare enum for field breed
//        • Create 3 instances of type Dog
//        • Check if there is no two dogs with the same name
//        • Display the name and the kind of the oldest dog

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    //Declare enum for field breed
    enum Breed{
        Akita, Bulldog, Husky
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Check if there is no two dogs with the same name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
