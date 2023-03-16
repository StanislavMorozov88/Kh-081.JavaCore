package com.softserve.edu08.publicc;

public class Appl {
    public static void main(String[] args) {

        Person1 person = new Person1(28);
       // Person1.FullName personWithName = person.new FullName("Oleg", "Kostenko");
        // personWithName.info();
        Person1.FullName personWithName1 = new Person1(25).new FullName("Oleg", "Kostenko");

        personWithName1.info();


    }
}
