package edu06.homework.task1;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    public void fly(){
        System.out.println("Eagles fly more faster than another.");
    }
}
