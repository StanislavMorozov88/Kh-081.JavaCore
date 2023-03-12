package edu06.homework.task1;

import edu06.homework.task1.Bird;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("It can fly...");
    }
}
