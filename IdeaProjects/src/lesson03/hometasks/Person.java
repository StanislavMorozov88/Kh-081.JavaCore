package lesson03.hometasks;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    private static final Scanner SC = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        if (!isName(firstName)||!isName(lastName)){
            throw new IllegalArgumentException("First name or last name is null or empty");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public int getAge(){
        if (this.birthYear==0){
            System.out.println("Field birthYear is not defined\n");
            return -1;
        } else return LocalDate.now().getYear()-this.birthYear;
    }

    public void input(){
            System.out.println("Enter first name: ");
            this.firstName = readName();

            System.out.println("Enter your lastName: ");
            this.lastName = readName();

            System.out.println("Enter year of your birthday: ");
            this.birthYear=readBirthYear();
            SC.nextLine();
    }

    public void output(){
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        if (this.birthYear > 0){
            System.out.println("Age: " + this.getAge()+"\n");
        } else this.getAge();
    }

    public void changeName(String fn, String ln){
        if (fn!=null){
            this.firstName = fn;
        }
        if (ln!=null){
            this.lastName = ln;
        }
    }

    private String readName(){
        return SC.nextLine();
    }

    private int readBirthYear(){
        while (true) {
            try {
                int year = SC.nextInt();
                checkYearBirth(year);
                return year;
            }
            catch (InputMismatchException e) {
                System.out.println("It's not a valid year ");
                SC.nextLine();
            }
            catch (IllegalArgumentException e){
                System.out.println(e);
                SC.nextLine();
            }
        }
    }

    private static void checkYearBirth(int yearOfBirth){
        if (yearOfBirth > LocalDate.now().getYear()|| yearOfBirth < 1900 ){
            throw new IllegalArgumentException("Year of birth can't be greater than " + LocalDate.now().getYear() + " and less than 1900");
        }
    }

    private boolean isName(String name){
        return name!=null && !name.isBlank();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear() {
        System.out.println("Enter year of birthday: ");
        this.birthYear = readBirthYear();
    }

    //It's just another option for setting birthYear field (without scanner). I am not sure which one is correct.
    public void setBirthYear(int birthYear){
        checkYearBirth(birthYear);
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
