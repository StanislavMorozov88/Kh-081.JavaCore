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
        printMoveStatus();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void printMoveStatus() {
        System.out.print("[Truck] ");
        super.printMoveStatus();
    }

    @Override
    public String toString() {
        return "{ Truck " + super.toString()
                + " }";
    }
}
