package lesson2.pt;

import lesson2.hw.Person;

public class employeeMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.input();
        p1.output();

        Person p2 = new Person("Tom", "Raider");
        p2.setBirthYear(2005);
        p2.output();
        p2.changeName("John", "Smith");
        p2.output();

        Person p3 = new Person();
        p3.setBirthYear(2001);
        p3.setFirstName("Mick");
        p3.setLastName("White");
        p3.output();

        Person p4 = new Person("Alex", "Taylor");
        p4.setBirthYear(2005);
        p4.output();

        Person p5 = new Person();
        p5.input();
        p5.changeName("Leo", "Brown");
        p5.output();
    }
}
