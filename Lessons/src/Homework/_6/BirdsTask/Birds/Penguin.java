package Homework._6.BirdsTask.Birds;

import Homework._6.BirdsTask.NonFlyingBird;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly(){
        System.out.println("Penguins cannot fly or run, but they swim and dive perfectly");
    }

}
