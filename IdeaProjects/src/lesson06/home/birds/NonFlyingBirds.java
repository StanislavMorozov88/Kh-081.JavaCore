package lesson06.home.birds;

public abstract class NonFlyingBirds extends Bird {
    private double maxWalkingSpeed;
    protected double currentWalkingSpeed;

    protected NonFlyingBirds(String feathers, int layEggs, double maxWalkingSpeed) {
        super(feathers, layEggs);
        this.maxWalkingSpeed = maxWalkingSpeed;
        currentWalkingSpeed = 0;
    }

    public abstract void walk();

    public void stop() {
        currentWalkingSpeed = 0;
        printWalkingStatus();
    }

    public void printWalkingStatus() {
        if (currentWalkingSpeed > 0) {
            if (currentWalkingSpeed == maxWalkingSpeed) {
                System.out.printf("is walking at a maximum speed of %,.2f km/h.%n", maxWalkingSpeed);
            } else {
                System.out.printf("is walking at a speed of %,.2f km/h.%n", currentWalkingSpeed);
            }
        } else System.out.println("is stopped.");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    public double getMaxWalkingSpeed() {
        return maxWalkingSpeed;
    }

    public double getCurrentWalkingSpeed() {
        return currentWalkingSpeed;
    }

    @Override
    public String toString() {
        return "NonFlyingBirds{" +
                "maxWalkingSpeed=" + maxWalkingSpeed +
                ", currentWalkingSpeed=" + currentWalkingSpeed +
                "} " + super.toString();
    }
}
