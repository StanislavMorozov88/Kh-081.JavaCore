package com.softserve.lesson7.homeTask.vehicleAndPassengers;

public class Car extends GroundVehicle{

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }


    @Override
    public void drive() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
