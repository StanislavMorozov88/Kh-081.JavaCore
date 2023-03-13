package com.softserve.lesson7.homeTask.vehicleAndPassengers;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    @Override
    public void drive() {

    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
