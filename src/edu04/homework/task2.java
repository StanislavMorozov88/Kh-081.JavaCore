package edu04.homework;

import static edu04.homework.Dog.*;

public class task2 {
    public static void main(String[] args) {
    Dog dog1 = new Dog("Patron",  Breed.Boxer, 15);
    Dog dog2 = new Dog("Baks", Breed.Dalmatin, 10);
    Dog dog3 = new Dog("Big", Breed.Bulldog, 5);

    String name1 = dog1.getName();
    String name2 = dog2.getName();
    String name3 = dog3.getName();

    if(name1.equals(name2) == true || name2.equals(name3) == true || name1.equals(name3) == true){
        System.out.println("There are dogs with the same name. Chek names!");
    } else {
        System.out.println("All dogs have unique names.");
    }

    int age1 = dog1.getAge();
    int age2 = dog2.getAge();
    int age3 = dog3.getAge();

    if(age1 > age2 & age1 > age3){
        System.out.println(dog1.getName() + " " + dog1.getBreed());
    } else if (age2 > age1 & age2 > age3){
        System.out.println(dog2.getName() + " " + dog2.getBreed());
        } else if (age3 > age1 & age3 > age2){
          System.out.println(dog3.getName() + " " + dog3.getBreed());

          //Порівняння віку описав тільки для того випадку, коли у кожної собак вік унікальний.

      }

    }
}
