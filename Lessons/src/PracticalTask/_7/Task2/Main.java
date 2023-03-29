package PracticalTask._7.Task2;

public class Main {
    public static void main(String[] args) {

        System.out.print("There is: ");

        Person[] persons = {
                new Student("Maxim"),
                new Cleaner("Ivan"),
                new Teacher("Maria")
        };
        System.out.println("\n\n<===================================>");

        for(Person person: persons){
            person.print();
            if(person instanceof Staff){
                System.out.println("My salary is " + ((Staff) person).salary() + "₴; ");
            }
            System.out.println();
        }
    }
}
/*
    * Create next structure:
    * In abstract class Person with property name, declare abstract method print().
    * In other classes in body of method print() output text “I am a …”.
    * In class Staff declare abstract method salary().
   ?* In each concrete class create constant TYPE_PERSON.
   ?* Output type of person in each constructor.
    * Create array of Person and add some Teachers, Cleaners and Students to it.
    * Call method print() for all of it.
    * Call method salary() for all Teachers and Cleaners
 */