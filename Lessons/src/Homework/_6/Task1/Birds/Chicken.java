package Homework._6.Task1.Birds;

import Homework._6.Task1.NonFlyingBird;

public class Chicken extends NonFlyingBird {

    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("Chickens can fly, but not long distances");
    }

}
