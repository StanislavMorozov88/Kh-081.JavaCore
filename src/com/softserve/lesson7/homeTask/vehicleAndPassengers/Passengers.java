package com.softserve.lesson7.homeTask.vehicleAndPassengers;

public abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}