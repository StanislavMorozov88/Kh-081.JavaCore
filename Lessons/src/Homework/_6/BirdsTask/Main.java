package Homework._6.BirdsTask;

import Homework._6.BirdsTask.Birds.Chicken;
import Homework._6.BirdsTask.Birds.Eagle;
import Homework._6.BirdsTask.Birds.Penguin;
import Homework._6.BirdsTask.Birds.Swallow;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = {
                new Eagle("It is dark brown in color", "Often the female lays two eggs"),
                new Penguin("The feathers of penguins are more like fluff", "Lays a single egg on its paws"),
                new Swallow("The head is red-brown, the rest of the lower feathers are white", "Make two clutches of 3-6 eggs each"),
                new Chicken("The feather is white or with a very pale brown color", "On average, it turns out from one egg per day to one every two days")
        };

        for(Bird bird: birds){
            System.out.println(bird.getClass().getSimpleName() + ":");
            bird.fly();
            bird.info();
            System.out.println();
        }

    }
}
/*
        Develop abstract class Bird with attributes feathers and layEggs and an abstract method fly().
        Develop classes FlyingBird and NonFlyingBird.
        Create class Eagle, Swallow, Penguin and Chicken.
        Create array Bird and add different birds to it.
        Call fly() method for all of it. Output the
        information about each type of created bird.
*/