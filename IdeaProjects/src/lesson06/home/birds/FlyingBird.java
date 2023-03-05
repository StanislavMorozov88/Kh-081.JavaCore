package lesson06.home.birds;

public class FlyingBird extends Bird {
    private double maxFlightAltitude;

    {
        maxFlightAltitude = 0;
    }

    protected FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        printFlightStatus();
    }

    protected void printFlightStatus() {
        if (maxFlightAltitude > 0) {
            System.out.printf("I can fly at an altitude of %,.2f meters.%n", maxFlightAltitude);
        } else System.out.println("I am FlyingBird. I can fly");
    }

    public void setMaxFlightAltitude(double maxFlightAltitude) {
        this.maxFlightAltitude = maxFlightAltitude;
    }

    public double getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "maxFlightAltitude=" + maxFlightAltitude +
                "} " + super.toString();
    }
}
