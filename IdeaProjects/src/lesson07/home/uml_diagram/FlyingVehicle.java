package lesson07.home.uml_diagram;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {
    }

    public abstract void fly();

    public abstract void land();
}
