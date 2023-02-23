import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getAge() {
        return 2023 - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name");
        firstName = scanner.nextLine();

        System.out.println("Enter last name");
        lastName = scanner.nextLine();

        System.out.println("Enter birth");
        birthYear = scanner.nextInt();

        scanner.close();

    }

    public void output() {
        System.out.println("\n Your name is " + firstName +
                "\n Your surname is " + lastName +
                "\n Your birth year is " + birthYear +
                "\n Your age is  " + getAge()+
                "\n ===============================");

    }

    public void changeName( String fn, String ln) {
        lastName = ln;
        firstName = fn;

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


    public static void main(String[] args) {
        Person p1 = new Person("Roman", "Zozulia");
        p1.setBirthYear(2003);
        p1.output();

        Person p2 = new Person("Iryna", "Zozulia");
        p2.setBirthYear(2004);
        p2.output();

        Person p3 = new Person("Tony", "Stark");
        p3.setBirthYear(1971);
        p3.output();

        Person p4 = new Person("Steve", "Rogers");
        p4.setBirthYear(1903);
        p4.output();

        Person p5 = new Person();
        p5.setFirstName("Yulia");
        p5.setLastName("Lisovska");
        p5.setBirthYear(1991);
        p5.output();

        Person p6 =new Person();
        p6.changeName("Nick","Fury");
        p6.setBirthYear(1960);
        p6.output();

        Person p7 = new Person();
        p7.input();
        p7.output();


    }
}