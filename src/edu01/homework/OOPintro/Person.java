package edu01.homework.OOPintro;


import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    LocalDate currentDate = LocalDate.now();
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter first name: ");
        this.firstName = sc.next();

        System.out.println("Enter last name: ");
        this.lastName = sc.next();

        System.out.println("Enter the birth year: ");
        this.birthYear = sc.nextShort();
    }
    public void output(){
        System.out.println("Person's information is: " + this.firstName + " " + this.lastName + " and "
                + this.birthYear + " year of birth, which is: " + getAge());
    }
    public void changeName(String fn, String ln){
        if(checkIfStringIsCorrect(fn) || checkIfStringIsCorrect(ln)) {
            this.firstName = fn;
            this.lastName = ln;
        }
        else throw new IllegalArgumentException("Name is invalid.");
    }
    public int getAge(){
        return currentDate.getYear() - birthYear;
    }
    private boolean checkIfStringIsCorrect(String s){
        if(s.isBlank() || s.isEmpty()) return false;
        else return true;
    }
    //This function should check if Person has Age assigned
    private int checkIfAgeIsAssignedToPerson(){
        return 0;
    }
    public Person() {
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setBirthYear(int birthYear) {
        if(birthYear < 1900 || birthYear > currentDate.getYear()) throw new IllegalArgumentException("Invalid year.");
        this.birthYear = birthYear;
    }
}
