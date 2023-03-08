package lesson6.hw2;

abstract public class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }
    abstract public void fly();
    abstract public void land();
}
