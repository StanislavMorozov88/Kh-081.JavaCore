package edu06.practical.task1;

import edu06.practical.task1.Car;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    public void run(){
        System.out.println("Run Truck Run!");
    }

    public void stop(){
        System.out.println("Stop Truck Stop!");
    }
}
