package edu04.homework;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void infoForDog(Dog[] dogs) {
        if (hasDuplicateName(dogs)) {
            System.out.println("Two dogs have the same name");
        } else {
            System.out.println("Dogs don't have the same name");
        }
        Dog oldest = oldestDog(dogs);
        System.out.println("The oldest dog is: " + oldest.name + ", " + oldest.breed);
    }

    public static boolean hasDuplicateName(Dog[] dogs) {
        boolean hasDuplicateName = false;
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].name == dogs[j].name){
                    hasDuplicateName = true;
                }
            }
        }
        return hasDuplicateName;
    }
    private static Dog oldestDog(Dog[] dogs){
       Dog oldest = dogs[0];
       for (Dog d : dogs){
           if (d.age > oldest.age){
               oldest = d;
           }
       }
        return oldest;
    }
    enum Breed {
        AKITA("Akita"), SHEPHERD("Shepherd"), MALAMUT("Malamut");

        private String breed;

        Breed(String breed) {
            this.breed = breed;
        }
    }
}