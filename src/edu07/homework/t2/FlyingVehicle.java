package edu07.homework.t2;

public class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle() {
    }
    void fly(){
        System.out.println("This vehicle can fly.");
    }
    void land(){
        System.out.println("This vehicle can land.");
    }
}
