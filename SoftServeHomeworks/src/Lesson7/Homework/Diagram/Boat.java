package Lesson7.Homework.Diagram;

public class Boat extends WaterVehicle{
    private int volume;
    public Boat(){

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
