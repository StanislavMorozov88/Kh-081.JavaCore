package lesson06.home.birds;

public class Eagle extends FlyingBird{

    public Eagle(String feathers, int layEggs, double maxFlightAltitude) {
        super(feathers, layEggs, maxFlightAltitude);
    }

    @Override
    public void fly() {
        if (currentFlightAltitude<getMaxFlightAltitude()){
            currentFlightAltitude+=(getMaxFlightAltitude()*0.5);
            if (currentFlightAltitude > getMaxFlightAltitude()){
                currentFlightAltitude = getMaxFlightAltitude();
            }
        }
        System.out.print("I am Eagle. ");
        printFlightStatus();
    }

    @Override
    public void lend() {
        System.out.print("I am Eagle ");
        super.lend();
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }
}
