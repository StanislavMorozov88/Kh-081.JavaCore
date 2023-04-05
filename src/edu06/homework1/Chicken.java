package edu06.homework1;

import edu06.homework1.nonFlyingBird;

public class Chicken extends nonFlyingBird{

    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("can't fly be4");

    }
}
