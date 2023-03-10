package edu06.practical;

public class Sedan extends Car{

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }
    public void run(){
        System.out.println("Run Sedan Run!");
    }

    public void stop(){
        System.out.println("Stop Sedan Stop!");
    }
}
