package edu06.practical;

public class Truck extends Car{

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
