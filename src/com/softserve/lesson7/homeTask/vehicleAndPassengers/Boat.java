package com.softserve.lesson7.homeTask.vehicleAndPassengers;

public class Boat extends WaterVehicle{
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    public void isSailing() {

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
