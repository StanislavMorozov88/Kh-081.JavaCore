package edu02.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    public static void main(String[] args) throws IOException {

        Person p1 = new Person();
        p1.input();

        Person p2 = new Person();
        p2.input();

        Person p3 = new Person();
        p3.input();

        Person p4 = new Person();
        p4.input();

        Person p5 = new Person();
        p5.input();

        //p2.out();


    }

    private String firstName, lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public int getAge(){
        return (2023 - birthYear);
    }

    public void changeName(String fn, String ln){
        this.firstName = fn;
        this.lastName = ln;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first name: ");
        firstName = br.readLine();
        System.out.println("Input last name: ");
        lastName = br.readLine();
        System.out.println("Input birth year: ");
        birthYear = Integer.parseInt(br.readLine());
    }

    public void out(){
        System.out.println(firstName + " " + lastName + " " + birthYear);
    }


}
