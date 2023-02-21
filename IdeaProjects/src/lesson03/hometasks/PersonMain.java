package lesson03.hometasks;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person("Ivan","Petrov");
        Person person4 = new Person("John","Johnson");
        Person person5 = new Person("Harry","Potter");

        person1.input();
        person2.input();
        person3.setBirthYear();
        person4.changeName(" "," "); // since this method has two parameters and user can change both/or only one of object's field I decided do not discard empty values.
        person4.setBirthYear();
        System.out.println();

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();


    }
}
