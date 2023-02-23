package Lesson3.Hw3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int age;
    public Person(){
    }
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

    public void setAge(int birthYear) {
        this.age = 2023 - birthYear;
    }

    public  int getAge() {
        return age;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur 1st name");
        this.firstName = scanner.nextLine();
        System.out.println("Enter ur surname");
        this.lastName = scanner.nextLine();
        System.out.println("Enter ur year of birth");
        this.birthYear = scanner.nextInt();
        }
        public void output(){
            System.out.println("Ur name is: " + firstName);
            System.out.println("Ur surname is: " + lastName);
            if(birthYear > 0){
                System.out.println("U are " + (2023 - birthYear) + " years old");
            }else{
                System.out.println("You are so young");
            }
        }
        public void changeName(String fn, String ln){
        if (fn.length() > 2){
            System.out.println("Ur name's length should be more than 2 symbols, otherwise we will use your previous name");
           this.firstName = fn;
        }
        if(ln.length() > 2){
            System.out.println("Ur surname's length should be more than 2 symbols, otherwise we will use your previous surname");
        this.lastName = ln;
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person("Ivan", "Vanev");
        Person p4 = new Person("Oleh", "Smith");
        Person p5 = new Person();
        p5.setFirstName("Taras");
        p5.setLastName("Shevchenko");
        p5.setBirthYear(1814);
        p1.input();
        p1.output();
        p2.input();
        p2.output();
        System.out.println();
        p3.output();
        System.out.println();
        p4.output();
        System.out.println();
        p5.output();
        System.out.println();
        p1.changeName("wq", "olezhik");
        p1.output();
    }
    }

