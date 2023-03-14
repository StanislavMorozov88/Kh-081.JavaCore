package edu01.homework.OOPintro;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Andrii", "Pasternak");
        p1.setBirthYear(2002);
        Person p2 = new Person();
        p2.input();
        Person p3 = new Person("Petro", "Poroshenko");
        p3.changeName("Volodymyr", "Zelenskiy");
        p1.output();
        p2.output();
        p3.output();
    }
}
