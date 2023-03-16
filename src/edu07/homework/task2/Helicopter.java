package edu07.homework.task2;

import java.sql.SQLOutput;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("The helicopter flies everywhere, but not high and not far.");
    }

    @Override
    public void land() {
        System.out.println("The helicopter lands everywhere.");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "Passengers=" + getPassengers() +
                ", weight=" + weight +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
