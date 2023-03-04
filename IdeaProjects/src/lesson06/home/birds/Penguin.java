package lesson06.home.birds;

public class Penguin extends NonFlyingBirds {

    public Penguin(String feathers, int layEggs, double maxWalkingSpeed) {
        super(feathers, layEggs, maxWalkingSpeed);
    }

    @Override
    public void walk() {
        if (currentWalkingSpeed < getMaxWalkingSpeed()) {
            currentWalkingSpeed += (getMaxWalkingSpeed() * 0.34);
            if (currentWalkingSpeed > getMaxWalkingSpeed()) {
                currentWalkingSpeed = getMaxWalkingSpeed();
            }
        }
        printWalkingStatus();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void fly() {
        System.out.print("I am Penguin ");
        super.fly();
    }

    @Override
    public void printWalkingStatus() {
        System.out.print("Penguin ");
        super.printWalkingStatus();
    }

    @Override
    public String toString() {
        return "Penguin{} " + super.toString();
    }
}
