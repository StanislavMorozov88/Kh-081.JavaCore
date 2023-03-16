package edu07.homework.task2;

public class task2 {
    public static void main(String[] args) {
        Passengers[] passengers = {
                new Liner(1000, 10),
                new Boat(10, 200),
                new Plane(250, 1000),
                new Helicopter(5,4000, 4000),
                new Bus(40,"Kyiv - Lviv"),
                new Motorcycle(2,200),
                new Car(5,"Audi")
        };

        for (Passengers passenger : passengers){
            System.out.println(passenger);
        }

        System.out.println("-----------------------------------");
        System.out.println("Check method isSailing()");
        for (Passengers passenger : passengers){
            if(passenger instanceof WaterVehicle){
                ((WaterVehicle) passenger).isSailing();
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Check method fly()");
        for(Passengers passenger : passengers){
            if(passenger instanceof FlyingVehicle){
                ((FlyingVehicle) passenger).fly();
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Check method land()");
        for(Passengers passenger : passengers){
            if(passenger instanceof FlyingVehicle){
                ((FlyingVehicle) passenger).land();
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("Check method drive()");
        for(Passengers passenger : passengers){
            if(passenger instanceof GroundVehicle){
                ((GroundVehicle) passenger).drive();
            }


        }
    }
}
