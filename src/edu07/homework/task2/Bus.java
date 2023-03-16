package edu07.homework.task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus drives along the route" + " " + route);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "Passengers=" + getPassengers() +
                ", route='" + route + '\'' +
                '}';
    }
}
