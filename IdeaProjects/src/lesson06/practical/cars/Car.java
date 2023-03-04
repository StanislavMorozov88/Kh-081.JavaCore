package lesson06.practical.cars;

public abstract class Car {
    private String model;
    private double maxSpeed;
    private int yearOfManufacture;
    protected double currentSpeed;

    {
        currentSpeed = 0;
    }

    public Car(String model, double maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public abstract void run();

    public void stop() {
        currentSpeed = 0;
        printMoveStatus();
    }

    public void printMoveStatus() {
        if (currentSpeed > 0) {
            if (currentSpeed == maxSpeed) {
                System.out.printf("%s is moving at maximum speed %,.2f%n", model, currentSpeed);
            } else {
                System.out.printf("%s is moving at a speed %,.2f. %s can run faster.%n", model, currentSpeed, model);
            }
        } else System.out.printf("%s stopped, currentSpeed is: %,.2f.%n", model, currentSpeed);
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

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Model: '" + model.toUpperCase() +
                "', currentSpeed: " + currentSpeed +
                ", maxSpeed: " + maxSpeed +
                ", yearOfManufacture: " + yearOfManufacture;

    }
}
