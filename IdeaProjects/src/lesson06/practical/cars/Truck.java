package lesson06.practical.cars;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        if (getCurrentSpeed() < getMaxSpeed()) {
            currentSpeed += (getMaxSpeed() * 0.25);
            if (getCurrentSpeed() > getMaxSpeed()) {
                currentSpeed = getMaxSpeed();
            }
        }
        System.out.print("[Truck] ");
        printMoveStatus();

    }

    @Override
    public void stop() {
        System.out.print("[Truck] ");
        super.stop();
    }

    @Override
    public String toString() {
        return "{ Truck " + super.toString()
                + " }";
    }
}
