package edu07.homework.task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The plane flies high in the sky and very far.");
    }

    @Override
    public void land() {
        System.out.println("The plane lands on the landing-strip.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "Passengers=" + getPassengers() +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
