package edu06.homework.task1;

import edu06.homework.task1.Bird;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }


    public void fly() {
        System.out.println("It can't fly");
    }
}
