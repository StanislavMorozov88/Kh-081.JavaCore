package com.softserve.lesson6.practicalTask.car;

public class Sedan extends Car{

    public String model;
    public double maxSpeed;
    public int yearOfManufacture;

    public Sedan(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
