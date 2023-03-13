package com.softserve.lesson7.homeTask.vehicleAndPassengers;

public class Liner extends WaterVehicle{
    private int floors;
    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
