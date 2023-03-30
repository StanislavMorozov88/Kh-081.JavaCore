package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.FlyingVehicle;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter() {
    }

    @Override
    public void fly() {
        String art = "        -↗↗↗↗-|-↙↙↙↙-\n"
                   + "      *>=====[_]L)\n"
                   + "           -'-`-"
                   + "              ( `  ) . )\n"
                   + "   (  _ )_                   (_, _(  ,_)_)\n"
                   + " (_  _(_ ,)";

        System.out.println(art);
    }

    @Override
    public void land() {
        String art = "     -----|-----\n"
                   + "  *>=====[_]L)\n"
                   + "________-'-`-________\n";

        System.out.println(art);
    }
}
