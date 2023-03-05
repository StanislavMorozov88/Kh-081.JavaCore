package lesson5.pt1;

//2. Develop classes Truck and Sedan which extend class Car.
//3. In main method create array of Car’s objects.
//   Add to this array some trucks and sedans and print info about it.

public class Sedan extends Car {

    public Sedan() {
    }

    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        // invoke superclass'(Car) constructor
        super(model, maxSpeed, yearOfManufacture);
    }

    //override methods
    @Override
    public void run() {
        System.out.println("'" + getModel() + "' sedan is running");

    }

    @Override
    public void stop() {
        System.out.println("'" + getModel() + "' sedan stopped");
    }
}
