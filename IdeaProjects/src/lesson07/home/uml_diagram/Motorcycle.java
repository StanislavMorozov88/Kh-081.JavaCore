package lesson07.home.uml_diagram;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    public void drive() {

    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}