package lesson07.practical.animal;

public class Dog implements Animal {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("WooFFF");
    }

    @Override
    public void feed() {
        System.out.println("Dog " + name + " gaines 0.08 kg after every meal");
        weight += 0.08;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
