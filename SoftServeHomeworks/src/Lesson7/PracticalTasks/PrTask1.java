package Lesson7.PracticalTasks;

public class PrTask1 {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Catty",3), new Dog("Buddy", 50), new Cat("Tom", 6), new Dog("Berry", 40)};
        for (int i = 0; i < animals.length ; i++) {
            System.out.println(animals[i].toString());
            animals[i].voice();
            animals[i].feed();
        }
    }
}
