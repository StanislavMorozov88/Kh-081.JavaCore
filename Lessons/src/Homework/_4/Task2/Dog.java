package Homework._4.Task2;

public class Dog {
        enum Breed{
            Borzoi("Borzoi"),
            Labrador("Labrador"),
            Poodle("Poodle");
            final String breedName;

            Breed(String breedName) {
                this.breedName = breedName;
            }
        }
        private String breed;
        private String name;
        private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) throws Exception {
        this.name = name;
        if(age>0) {
            this.age = age;
        }else {
            throw new Exception("Age must be bigger than 0");
        }
    }

    public Dog(Breed breed) {
        this.breed = breed.breedName;
    }

    public Dog(Breed breed, int age) throws Exception {
        this.breed = breed.breedName;
        if(age>0) {
            this.age = age;
        }else {
            throw new Exception("Age must be bigger than 0");
        }
    }

    public Dog(String name, Breed breed, int age) throws Exception {
        this.breed = breed.breedName;
        this.name = name;
        if(age>0) {
            this.age = age;
        }else {
            throw new Exception("Age must be bigger than 0");
        }
    }
    public Dog(String name, Breed breed) {
        this.breed = breed.breedName;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age>0) {
            this.age = age;
        }else {
            throw new Exception("Age must be bigger than 0");
        }
    }
}
