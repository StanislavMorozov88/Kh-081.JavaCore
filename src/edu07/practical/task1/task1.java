package edu07.practical.task1;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        Animal[] animals = {
              new Cat("Si"),
              new Dog("Jack"),
              new Cat("Gracie"),
              new Dog("Mukhtar")
        };

        for(Animal animal : animals){
            System.out.println(animal);
        }

        System.out.println("----------");
        for(int i = 0; i < animals.length; i++){
            animals[i].voice();
        }

        System.out.println("----------");
        for (int i = 0; i < animals.length; i++){
            animals[i].feed();
        }
    }
}
