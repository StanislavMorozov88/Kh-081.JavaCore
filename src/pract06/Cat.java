package pract06;

public class Cat implements Animal {
    private String alias;
    private String meal;
    private double weight;

    public Cat(String alias, String meal, double weight) {
        this.alias = alias;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Cat says Meow!");
    }

    @Override
    public void feed() {
        System.out.println(this.getClass().getSimpleName() + " " + alias + " likes" + meal);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "alias='" + alias + '\'' +
                ", meal='" + meal + '\'' +
                ", weight=" + weight +
                '}';
    }
}