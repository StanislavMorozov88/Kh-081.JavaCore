package Lesson7.PracticalTasks;

public class PrTask2 {
    public static void main(String[] args) {
        Person[] persons = {new Teacher("Bob" , 3000), new Cleaner("Tod", 2000), new Student("Alex", 1000)};
        for (int i = 0; i < persons.length ; i++) {
            persons[i].print();
            persons[i].salary();
        }
    }
}
