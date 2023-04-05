package edu06.homework1;

public class Penguin extends nonFlyingBird{
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("it can't fly be4");

    }
}
