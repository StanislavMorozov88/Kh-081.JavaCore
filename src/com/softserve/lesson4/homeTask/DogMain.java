package com.softserve.lesson4.homeTask;

/**
 * This program displays the oldest dog
 * and shows if there are dogs with same names
 */
public class DogMain {

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog(5, "Biden", Dog.Breed.BOSTON_TERRIER );
        dogs[1] = new Dog(2, "Trump", Dog.Breed.SHIH_TZU);
        dogs[2] = new Dog(7, "Queen", Dog.Breed.CAVALIER_SPANIEL);

        checkName(dogs);
        checkAge(dogs);
    }

    /**
     * This method checks if there are dogs with the same names
     * @param dogs is an array of dogs
     */
    private static void checkName(Dog[] dogs){
        if (dogs[0].getName() == dogs[1].getName()){
            System.out.println(dogs[0].getName() + " " + dogs[1].getName() + " have same names");
        } else if (dogs[0].getName() == dogs[2].getName()) {
            System.out.println(dogs[0].getName() + " " + dogs[2].getName() + " have same names");
        } else if (dogs[1].getName() == dogs[2].getName()) {
            System.out.println(dogs[1].getName() + " " + dogs[2].getName() + " have same names");
        } else{
            System.out.println("No same names");
        }
    }

    /**
     * This method displays the oldest dog
     * @param dogs dogs is an array of dogs
     */
    private static void checkAge(Dog[] dogs){
        Dog oldest = dogs[1];
        for (Dog dog : dogs) {
            if (oldest.getAge() < dog.getAge()) oldest = dog;
        }
        System.out.println("Oldest dog is " + oldest.getName() + " He/She is " + oldest.getAge());
    }

}
