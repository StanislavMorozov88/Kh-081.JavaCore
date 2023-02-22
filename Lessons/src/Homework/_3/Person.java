package Homework._3;

import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    //fields
    private String firstName;
    private String lastName;
    private int brithYear;
    private String info;

    //constructors
    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //methods
    public int getAge(){
        return java.time.LocalDate.now().getYear() - brithYear;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        Scanner ic = new Scanner(System.in);
        System.out.println("Hello, here you can input information about person!\n" +
                "Please, enter first name:");
        firstName = sc.nextLine();
        System.out.println("Enter last name:");
        lastName = sc.nextLine();
        System.out.println("Enter birth year:");
        brithYear = ic.nextInt();
        System.out.println("You can also write some info about current person:");
        info = sc.nextLine();
        System.out.println("Thanks you for your patience!");
        ic.close();
        sc.close();
    }

    public void output(){
        System.out.println(
                        "==================================================\n" +
                        "There some info about " + firstName + " " + lastName + ":\n" +
                        firstName + " " + lastName + " was born in " + brithYear + " year" + " (" + (LocalDate.now().getYear() - brithYear) + " y.o.)\n" +
                        "Note:\n" + info + "\n" +
                        "==================================================");
    }

    public void changeName(String firstName) {
            this.firstName = firstName;
    }
    public void changeName(String firstName, String lastName) {

        if(firstName.length()==0&&lastName.length()!=0){
            this.lastName = lastName;
        } else if (lastName.length()==0&&firstName.length()!=0) {
            this.firstName = firstName;
        }else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", brithYear=" + brithYear +
                '}';
    }

    //get&set
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

    public int getBrithYear() {
        return brithYear;
    }

    public void setBrithYear(int brithYear) {
        this.brithYear = brithYear;
    }
}
