package Lesson7.PracticalTasks;

public abstract class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public abstract void print();

    public String getName() {
        return name;
    }
    public abstract void salary();
    @Override
    public String toString() {
        return "Person: " +
                "Name='" + name + '\'' ;
    }
}
