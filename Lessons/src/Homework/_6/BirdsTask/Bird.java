package Homework._6.BirdsTask;

public abstract class Bird {

    private String feathers;
    private String layEggs;

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void info(){
        System.out.println("-Feathers: " + this.getFeathers() + "\n" +
                           "-Lay eggs: " + this.getLayEggs());
    }


    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }
}
