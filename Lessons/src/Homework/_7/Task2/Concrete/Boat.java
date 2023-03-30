package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.WaterVehicle;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
    }

    @Override
    public void isSailing() {
        String art = "            /|~~~   \n"
                   + "          ///|      \n"
                   + "        /////|      \n"
                   + "   \\=========|===/  \n"
                   + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~";


        System.out.println(art);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
