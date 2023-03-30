package Homework._7.Task2.Concrete;

import Homework._7.Task2.AbstractsAndInterrface.GroundVehicle;

public class Bus extends GroundVehicle {

    private String route;

    public Bus() {
    }

    @Override
    public void drive() {
        String art = "     _____________\n"
                   + "   _/_|[][][][][] | - -\n"
                   + "  (      City Bus | - -\n"
                   + "  =--OO-------OO--=dwb";
        System.out.println(art);

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
