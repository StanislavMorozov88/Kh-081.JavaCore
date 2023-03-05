package lesson06.home.birds;

public class Eagle extends FlyingBird{

    public Eagle(String feathers, int layEggs,double maxFlightAltitude) {
        super(feathers, layEggs);
        setMaxFlightAltitude(maxFlightAltitude);
    }

    @Override
    protected void printFlightStatus() {
        System.out.print("I am Eagle. ");
        super.printFlightStatus();
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
