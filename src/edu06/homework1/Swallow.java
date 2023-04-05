package edu06.homework1;

public class Swallow extends FlyingBird{
    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("it do can fly");
    }

}
