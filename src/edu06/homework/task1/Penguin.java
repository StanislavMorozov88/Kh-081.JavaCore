package edu06.homework.task1;

import edu06.homework.task1.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("Penguins don't fly!");
    }
}
