package lesson2.hw;

import java.time.Year;
import java.util.Scanner;

/*Create Console Application  and add class lesson2.hw.Person to the project.
    Class lesson2.hw.Person should consist of
        - three private fields: firstName, lastName and birthYear (the birthday year)
        - properties for access to these fields
        - default constructor and constructor with 2 parameters (first and last names)
        - methods:
            getAge() - to calculate the age of person
            input() - to input information about person
            output() - to output information about person
            changeName(String fn, String ln) - to change the first name or/and last name
        In the method main() create 5 objects of lesson2.hw.Person type and input information about them.
*/
public class Person {
    //fields
    private String firstName, lastName;
    private int birthYear;
    private int age;

    public int year = Year.now().getValue();
    private static int index;

    //constructors

    public Person() {
        index++;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        index++;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //methods
    public int getAge() {
        return age = year - birthYear;
    }

    public void input() {
        System.out.print("\nEnter some info about " + index + " person: " +
                "\nFirst name: ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        this.firstName = firstName;
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        this.lastName = lastName;
        System.out.print("Birth year: ");
        int birthYear = sc.nextInt();
        this.birthYear = birthYear;
    }

    public void output() {
        getAge();
        System.out.println("\nInformation about " + index + " person." +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nAge: " + age);
    }

    public void changeName(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }

}
