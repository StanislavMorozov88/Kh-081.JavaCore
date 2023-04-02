package edu06.practice;

public abstract class Car {
    /**
     Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
     Develop classes Truck and Sedan which extend class Car.
     In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it.
     */
    private String model;
    private double maxSpeed;
    private int yearOfManufacture;

    public Car(String model, double maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void run(){
        System.out.println("This car is running.");
    }
    public void stop(){
        System.out.println("This car is stopped.");
    }
    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
class Truck extends Car {
    private int cargoCapacity;

    public Truck(String model, int maxSpeed, int yearOfManufacture, int cargoCapacity) {
        super(model, maxSpeed, yearOfManufacture);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

class Sedan extends Car {
    private String bodyType;

    public Sedan(String model, int maxSpeed, int yearOfManufacture, String bodyType) {
        super(model, maxSpeed, yearOfManufacture);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
}

class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Truck("MAN", 80, 2010, 1500);
        cars[1] = new Sedan("BMW", 200, 2015, "Sedan");
        cars[2] = new Truck("Volvo", 70, 2012, 1200);
        cars[3] = new Sedan("Mercedes", 180, 2016, "Coupe");

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel() +
                    ", Max Speed: " + car.getMaxSpeed() +
                    ", Year of Manufacture: " + car.getYearOfManufacture());

            car.run();
            car.stop();
            System.out.println();
        }
    }
}