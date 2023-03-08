package lesson6.hw2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter is flying");
    }

    @Override
    public void land() {
        System.out.println("Helicopter has landed");
    }
}
