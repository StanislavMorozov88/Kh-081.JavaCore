package Homework._7.Task2;

import Homework._7.Task2.AbstractsAndInterrface.*;
import Homework._7.Task2.Concrete.*;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Liner(),
                new Boat(),
                new Plane(),
                new Helicopter(),
                new Bus(),
                new Motorcycle(),
                new Car()
        };

        System.out.println(">===================================================================<");
        for (Vehicle vehicle: vehicles){
            if (vehicle instanceof WaterVehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + ":");
                System.out.println("->Sailing:\n");
                ((WaterVehicle) vehicle).isSailing();
                System.out.println(">===================================================================<");
            } else if (vehicle instanceof FlyingVehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + ":");
                System.out.println("->Fly:\n");
                ((FlyingVehicle) vehicle).fly();
                System.out.println("\n->Land:\n");
                ((FlyingVehicle) vehicle).land();
                System.out.println(">===================================================================<");
            } else {
                System.out.println(vehicle.getClass().getSimpleName() + ":");
                System.out.println("->Drive:\n");
                ((GroundVehicle) vehicle).drive();
                System.out.println(">===================================================================<");
            }
        }

    }
}
