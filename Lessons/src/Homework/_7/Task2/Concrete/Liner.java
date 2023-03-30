package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.WaterVehicle;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }


    @Override
    public final void isSailing() {
        String art = "      __|▮|__|▮|__\n"
                   + "    _|___▮____▮___|___\n"
                   + "   |o o o o o o o o /\n"
                   + "~'`~'`~'`~'`~'`~'`~'`~'`~'`~";

        System.out.println(art);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
