package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.GroundVehicle;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle() {
    }

    @Override
    public void drive() {
        String art = "      ,\n"
                   + "   .-/c-.,::\n"
                   + "   (_)'==(_)";
        System.out.println(art);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
