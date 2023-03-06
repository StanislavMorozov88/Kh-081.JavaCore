package lesson07.practical.person;

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    protected abstract void print();

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
