package lesson07.practical.animal;

public class Cat implements Animal {
    private String name;
    private double weight;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("MeowWWW");
    }

    @Override
    public void feed() {
        System.out.println("Cat " + name + " gaines 0.05 kg after every meal");
        weight += 0.05;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
