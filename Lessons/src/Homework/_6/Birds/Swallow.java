package Homework._6.Birds;

import Homework._6.FlyingBird;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("The speed at which swallows fly is equal to 120 kilometers per hour");
    }
}
