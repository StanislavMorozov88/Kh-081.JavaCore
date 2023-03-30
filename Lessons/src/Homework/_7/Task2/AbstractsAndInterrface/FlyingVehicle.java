package Homework._7.Task2.AbstractsAndInterrface;

abstract public class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle() {
    }

    abstract public void fly();
    abstract public void land();
}
