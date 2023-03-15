package PracticalTask._6.CarWithAudio.audio;

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Sedan("Camry", 270, 2010),
                new Truck("Ram", 160, 2006),
                new Sedan("Beetle", 220, 2010),
                new Sedan("Jeep", 300, 2010)
        };

        for (Car car: cars){
            car.info();
        }
    }
}
