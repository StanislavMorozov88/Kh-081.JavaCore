package lesson07.home.uml_diagram;

public class Car extends GroundVehicle{
    private String model;

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {

    }
}
