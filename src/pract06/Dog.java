package pract06;

import java.security.spec.RSAOtherPrimeInfo;

public class Dog implements Animal{
    private String alias;
    private String meal;
    private double weight;

    public Dog(String alias, String meal, double weight) {
        this.alias = alias;
        this.meal = meal;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Dog is barking!");
    }

    @Override
    public void feed() {
        System.out.println(this.getClass().getSimpleName() + " " + alias + " likes " + meal);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "alias='" + alias + '\'' +
                ", meal='" + meal + '\'' +
                ", weight=" + weight +
                '}';
    }
}
