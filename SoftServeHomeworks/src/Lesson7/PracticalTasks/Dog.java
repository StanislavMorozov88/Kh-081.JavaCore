package Lesson7.PracticalTasks;

public class Dog implements Animal {
    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("I can bark");
    }

    @Override
    public void feed() {
        System.out.println("I have eaten dog's food");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
