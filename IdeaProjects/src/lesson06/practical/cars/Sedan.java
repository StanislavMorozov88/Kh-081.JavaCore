package lesson06.practical.cars;

public class Sedan extends Car {

    public Sedan(String model, double maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        if (getCurrentSpeed() < getMaxSpeed()) {
            currentSpeed += (getMaxSpeed() * 0.5);
            if (getCurrentSpeed() > getMaxSpeed()) {
                currentSpeed = getMaxSpeed();
            }
        }
        System.out.print("[Sedan] ");
        printMoveStatus();
    }

    @Override
    public void stop() {
        System.out.print("[Sedan] ");
        super.stop();
    }

    @Override
    public String toString() {
        return "{ Sedan: " + super.toString()
                + " }";
    }
}
