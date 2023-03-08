package lesson6.hw2;

public class Main {
    public static void main(String[] args) {
        WaterVehicle[] waterVehicles = new WaterVehicle[]{
                new Boat(32),
                new Liner(43),
        };
        GroundVehicle[] groundVehicles = new GroundVehicle[]{
                new Bus("ere"),
                new Car("t2"),
                new Motorcycle(232)
        };
        FlyingVehicle[] flyingVehicles = new FlyingVehicle[]{
                new Plane(234),
                new Helicopter(45, 23)
        };

        for (int i = 0; i < waterVehicles.length; i++) {
            waterVehicles[i].isSailing();
        }
        for (int i = 0; i < groundVehicles.length; i++) {
            groundVehicles[i].drive();
        }
        for (int i = 0; i < flyingVehicles.length; i++) {
            flyingVehicles[i].fly();
            flyingVehicles[i].land();
        }
    }
}
