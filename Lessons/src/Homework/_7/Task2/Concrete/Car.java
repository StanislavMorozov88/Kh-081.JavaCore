package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.GroundVehicle;

public class Car extends GroundVehicle {

    private String model;

    public Car() {
    }

    @Override
    public void drive() {
        String art = "    /|_||_\\`.__\n" +
                     "   (   _    _ _\\\n" +
                     "   =`-(_)--(_)-'  ";
        System.out.println(art);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
