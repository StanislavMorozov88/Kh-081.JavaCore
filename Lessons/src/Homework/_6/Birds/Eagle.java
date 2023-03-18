package Homework._6.Birds;

import Homework._6.FlyingBird;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("Eagles fly at an amazing speed at a height of not less than 700 meters");
    }




}
