package Lesson6.Homework;

public class Hw2 {
    public static void main(String[] args) {
        Developer d1 = new Developer("Taras", 12345, 25);
        Employee e1 = new Employee("Stas", 1000, 45);
        //викликай в циклі разом з методом instanse of
        System.out.println(d1.report());
        System.out.println();
        System.out.println(e1.report());
    }

}
