package homework05;

public class FlyingBird extends Bird {

    @Override
    public String fly() {
        System.out.println(" can fly");
        return "";
    }

    protected int maxFlightRange;
    protected int maxFlightSpeed;

    public void setMaxFlightRange(double maxFlightRange) {
        this.maxFlightRange = (int) maxFlightRange;
    }

    public int getMaxFlightRange() {
        return maxFlightRange;
    }

    public void setMaxFlightSpeed(double maxFlightSpeed) {
        this.maxFlightSpeed = (int) maxFlightSpeed;
    }

    public int getMaxFlightSpeed() {
        return maxFlightSpeed;
    }

}
class Eagle extends FlyingBird {
    @Override
    public void setMaxFlightRange(double maxFlightRange) {
        super.setMaxFlightRange(maxFlightRange);
    }

    @Override
    public void setMaxFlightSpeed(double maxFlightSpeed) {
        super.setMaxFlightSpeed(maxFlightSpeed);
    }
    protected double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

}

class Swallow extends FlyingBird {
    @Override
    public void setMaxFlightSpeed(double maxFlightSpeed) {
        super.setMaxFlightSpeed(maxFlightSpeed);
    }

    @Override
    public void setMaxFlightRange(double maxFlightRange) {
        super.setMaxFlightRange(maxFlightRange);
    }
    protected String food;

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
class DemoFlying{
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.weight = 6.3;
        eagle.maxFlightRange = 120;
        eagle.maxFlightSpeed = 160;

        Swallow swallow = new Swallow();
        swallow.food = "Insects";
        swallow.maxFlightRange = 45;
        swallow.maxFlightSpeed = 65;

        System.out.println("Max flight range of eagle is " + eagle.getMaxFlightRange());
        System.out.println("Max flight speed of eagle is " + eagle.getMaxFlightSpeed());
        System.out.println("Max weight of eagle is " + eagle.getWeight());

        System.out.println("Max flight range of swallow is " + swallow.getMaxFlightRange());
        System.out.println("Max flight speed of swallow is " + swallow.getMaxFlightSpeed());
        System.out.println("Swallow likes to eat " + swallow.getFood());
    }
}