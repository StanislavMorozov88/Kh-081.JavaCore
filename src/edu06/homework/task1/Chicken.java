package edu06.homework.task1;

public class Chicken extends NonFlyingBird {
    public Chicken(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("Chickens don't fly!");
    }
}
