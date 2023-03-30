package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.FlyingVehicle;

public class Plane extends FlyingVehicle {

    private int madDistance;

    @Override
    public void fly() {
        String art = "                       __↑__\n"
                  + "             __↑__  *---o0o---*\n"
                  + "   __↑__  *---o0o---*\n"
                  + "*---o0o---*";
        System.out.println(art);
    }

    @Override
    public void land() {
        String art = "   __↓__\n"
                   + "*---o0o---*  __↓__  \n"
                   + "          *---o0o---*  __↓__\n"
                   + "                    *---o0o---*";
        System.out.println(art);
    }

    public int getMadDistance() {
        return madDistance;
    }

    public void setMadDistance(int madDistance) {
        this.madDistance = madDistance;
    }
}
