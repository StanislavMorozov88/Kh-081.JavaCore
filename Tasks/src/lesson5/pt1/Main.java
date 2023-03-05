package lesson5.pt1;

//1. Create abstract class Car with model, maxSpeed and yearOfManufacture
//   properties and run() and stop() methods.
//2. Develop classes Truck and Sedan which extend class Car.
//3. In main method create array of Car’s objects.
//   Add to this array some trucks and sedans and print info about it.

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
                new Sedan("s1", 120, 2001),
                new Truck("t1", 180, 2010),
                new Truck("T2", 320, 2019),
                new Sedan("s2", 230, 2005)
        };

        System.out.println("Info: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i] + " ");
            cars[i].run();
            cars[i].stop();
        }

    }
}
