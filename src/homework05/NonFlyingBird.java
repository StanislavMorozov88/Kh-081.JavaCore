package homework05;

public class NonFlyingBird extends Bird {
    @Override
    public boolean fly() {
        return false;
    }
    protected double size;

    public void setSize(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }

}

class Penguin extends NonFlyingBird {

    protected String livingPlace;

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }
}

class Kiwi extends NonFlyingBird {

    protected double beakLength;

    public void setBeakLength(double beakLength) {
        this.beakLength = beakLength;
    }

    public double getBeakLength() {
        return beakLength;
    }
}

class DemoNonFlying{
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.livingPlace = "North Pole";
        penguin.size = 1.3;

        Kiwi kiwi = new Kiwi();
        kiwi.beakLength = 15.0;
        kiwi.size = 0.25;

        System.out.println("Penguin lives on the " + penguin.getLivingPlace());
        System.out.println("Penguin's size is " + penguin.getSize());

        System.out.println("Kiwi's beak length is " + kiwi.getBeakLength());
        System.out.println("Fiwi's size is " + kiwi.getSize());
    }
}
