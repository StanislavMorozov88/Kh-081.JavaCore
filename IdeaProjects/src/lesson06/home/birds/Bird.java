package lesson06.home.birds;

public abstract class Bird {
    private String feathers;
    private int layEggs;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
