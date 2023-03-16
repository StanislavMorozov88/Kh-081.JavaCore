package edu03.Homework;

import java.util.Scanner;
import java.time.LocalDate;

public class Person {
    private static final Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){};
    public Person(String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = lastName;

    }
public int getAge() {
    if (this.birthYear == 0) {
        System.out.println("not correct");
    } else {
        int i = LocalDate.now().getYear() - this.birthYear;
    }
    return 0;
}




        public void input () {
            System.out.println("enter firstname");
            Scanner scanner = new Scanner(System.in);
            this.firstName = scanner.nextLine();
            System.out.println("enter lastname");
            this.lastName = scanner.nextLine();
            System.out.println("enter birth Year");
            this.birthYear = scanner.nextInt();
        }
        public void output () {
            System.out.println("Firstname: " + this.firstName);
            System.out.println("Lastname: " + this.lastName);
            if (this.birthYear > 0) {
                System.out.println("Age " + this.getAge());
            } else this.getAge();
        }
        public void changeName (String fn, String ln){
            if (fn != null) {
                this.firstName = fn;
            }
            if (ln != null) {
                this.lastName = ln;
            }

        }

    private String readName() {
        return scanner.nextLine();
    }

    private int readBirthYear() {
        while (true){
            int year = scanner.nextInt();
            checkYearBirth(year);
            return year;

        }
    }

    private void checkYearBirth(int yearOfBirth) {
        if (yearOfBirth > LocalDate.now().getYear()|| yearOfBirth < 1900){
            throw new IllegalArgumentException("Cant be greater " + LocalDate.now().getYear() + " and less than 1900");
        }
    }
    private boolean isName(String name){
        return name != null && !name.isBlank();
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear() {
        this.birthYear = birthYear;
    }


}





