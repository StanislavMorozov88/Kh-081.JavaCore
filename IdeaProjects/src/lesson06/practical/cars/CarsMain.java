package lesson06.practical.cars;

public class CarsMain {
    public static void main(String[] args) {
        Car truck1 = new Truck("Chevrolet Tornado", 160, 1998);
        Car truck2 = new Truck("Ford Ranger", 180, 1985);
        Car sedan1 = new Sedan("Honda City", 200, 1995);
        Car sedan2 = new Sedan("Hyundai Aura", 210, 2000);

        truck1.run();
        truck2.run();
        sedan1.run();
        sedan1.run();
        System.out.println();

        Car[] cars = {truck1, sedan1, truck2, sedan2};
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
