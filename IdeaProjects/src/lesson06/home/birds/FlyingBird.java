package lesson06.home.birds;

public abstract class FlyingBird extends Bird{
    private double maxFlightAltitude;
    protected double currentFlightAltitude;

    public FlyingBird(String feathers, int layEggs, double maxFlightAltitude) {
        super(feathers, layEggs);
        this.maxFlightAltitude = maxFlightAltitude;
        this.currentFlightAltitude = 0;
    }

    public void lend(){
        currentFlightAltitude=0;
        printFlightStatus();
    }

    public void printFlightStatus(){
        if (currentFlightAltitude>0){
            if (currentFlightAltitude == maxFlightAltitude){
                System.out.printf("I am flying at %,.2f meters. I can fly faster.%n",currentFlightAltitude);
            } else {
                System.out.printf("I am flying at maximum altitude %,.2f meters.%n",maxFlightAltitude);
            }
        }else System.out.println("I have landed");
    }

    public double getCurrentFlightAltitude() {
        return currentFlightAltitude;
    }

    public double getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "maxFlightAltitude=" + maxFlightAltitude +
                ", currentFlightAltitude=" + currentFlightAltitude +
                "} " + super.toString();
    }
}
