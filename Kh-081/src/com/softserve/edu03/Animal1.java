package com.softserve.edu03;

//Простий приклад класу без застосування інкапсуляції.
//Приклад не є практичним і хорошим, наводиться просто для демонстрації
public class Animal1 {
    public String breed;
    public String name;
    public double age;
    public static int count = 0;
//нестатичний каунтер, можете спробувати статичний і подивитись що буде
    {
        count++;
    }

    //Параметризований конструктор
    public Animal1(String breed, String name, double age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public void jump() {
        System.out.println("I can jump");
    }
    //Тут ви бачите  поля класу, методи, параметризований конструктор

    public static void main(String[] args) {
        //Animal1 cat = new Animal1(); //Тут буде ерор, бо ми не можемо так створити без дефолтного конструктора
        //Як тільки ми створили параметризований конструктор дефолтний зникне

        Animal1 cat = new Animal1("Cat", "Tom", 1.1);
        Animal1 dog = new Animal1("Dog", "Jack", 5);
        Animal1 raccoon = new Animal1("Raccoon", "Rocket", 1.1);

        System.out.println("We created " + cat.breed + ", " + dog.breed + ", " + raccoon.breed);
        System.out.println("We have " + count + " animals.");

        cat.jump();
        dog.jump();



    }
}
