package Lesson7.PracticalTasks;

public class Cat implements Animal{
    private String name;
    private int weight;

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("I can meow");
    }

    @Override
    public void feed() {
        System.out.println("I have eaten cat's food");
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
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
