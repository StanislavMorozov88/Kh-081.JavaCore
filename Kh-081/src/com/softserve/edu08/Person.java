package com.softserve.edu08;

public class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Person copyOfPersone = (Person) super.clone();
        copyOfPersone.fullName = (FullName) copyOfPersone.fullName.clone();
        return copyOfPersone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person(new FullName("Mike", "Green"), 25);
       // try {
        Person copyOfPerson = (Person) person.clone();

        System.out.println("Original: " + person.fullName.getFirstName() + " " +
                person.fullName.getLastName() + ", " + person.age);
        System.out.println("Cloned: " + copyOfPerson.fullName.getFirstName() +
                " " + copyOfPerson.fullName.getLastName() + ", " + copyOfPerson.age);

        copyOfPerson.age = 37;
        copyOfPerson.fullName.setFirstName("Nick");
        copyOfPerson.fullName.setLastName("Brown");

        System.out.println("**-***-****-***");

        System.out.println("Original: " + person.fullName.getFirstName() + " " +
                person.fullName.getLastName() + ", " + person.age);
        System.out.println("Cloned: " + copyOfPerson.fullName.getFirstName() +
                " " + copyOfPerson.fullName.getLastName() + ", " + copyOfPerson.age);

//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }
}
