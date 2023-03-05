package lesson06.home.birds;

public class NonFlyingBirds extends Bird {
    private double maxWalkingSpeed;

    {
        maxWalkingSpeed = 0;
    }

    protected NonFlyingBirds(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am NonFlying bird. I can't fly");
    }

    public void walk() {
        printWalkingStatus();
    }

    protected void printWalkingStatus() {
        if (maxWalkingSpeed > 0) {
            System.out.printf("I can walk at a speed of %,.2f km/h%n", maxWalkingSpeed);
        } else System.out.println("I am NonFlying bird. I can walk");
    }

    public double getMaxWalkingSpeed() {
        return maxWalkingSpeed;
    }

    public void setMaxWalkingSpeed(double maxWalkingSpeed) {
        this.maxWalkingSpeed = maxWalkingSpeed;
    }

    @Override
    public String toString() {
        return "NonFlyingBirds{" +
                "maxWalkingSpeed=" + maxWalkingSpeed +
                "} " + super.toString();
    }
}
