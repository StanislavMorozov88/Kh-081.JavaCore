package lesson06.home.birds;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, int layEggs,double maxFlightAltitude) {
        super(feathers, layEggs);
        setMaxFlightAltitude(maxFlightAltitude);
    }

    @Override
    protected void printFlightStatus() {
        System.out.print("I am Swallow. ");
        super.printFlightStatus();
    }

    @Override
    public String toString() {
        return "Swallow{} " + super.toString();
    }
}
