package edu06.homework.task1;

import edu06.homework.task1.FlyingBird;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("Swallows fly more higher than another.");
    }
}
