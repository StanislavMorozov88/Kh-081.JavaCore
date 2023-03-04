package lesson06.home.birds;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, int layEggs, double maxFlightAltitude) {
        super(feathers, layEggs, maxFlightAltitude);
    }

    @Override
    public void fly() {
        if (currentFlightAltitude < getMaxFlightAltitude()) {
            currentFlightAltitude += (getMaxFlightAltitude() * 0.25);
            if (currentFlightAltitude > getMaxFlightAltitude()) {
                currentFlightAltitude = getMaxFlightAltitude();
            }
        }
        System.out.print("I am Swallow. ");
        printFlightStatus();
    }

    @Override
    public String toString() {
        return "Swallow{} " + super.toString();
    }
}
