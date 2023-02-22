package com.softserve.edu03;

//Простий приклад класу без застосування інкапсуляції.
//Приклад не є практичним і хорошим, наводиться просто для демонстрації
public class Animal {
    public String breed;
    public String name;
    public double age;

    //Тут ви бачите тільки поля класу без методів, дефолтний конструктор явно відсутній
    // але він є, хоч ви його і не бачите
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.breed = "Cat";
        cat.name = "Rocket";
        cat.age = 1.1;

        System.out.println("We created "+ cat.breed + ".");
        System.out.println("His name is "+cat.name + ".");
        System.out.println("His age is "+cat.age + ".");

    }
}
