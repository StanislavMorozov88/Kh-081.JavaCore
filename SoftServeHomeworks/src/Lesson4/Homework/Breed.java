package Lesson4.Homework;

public enum Breed {
    AKITA("Buddy", 12),
    LABRADOR("Friend", 2),
    BOXER("Bobik", 4);

    private String name;
    private int age;

    private Breed(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

