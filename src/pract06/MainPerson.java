package pract06;

public class MainPerson {
    public static void main(String[] args) {

        Person[] persons = new Person[4];
        persons[0] = new Student();
        persons[1] = new Cleaner();
        persons[2] = new Teacher();
        persons[3] = new Student();

        for (Person person : persons){
            System.out.println(person.print());
            System.out.println(person.getClass().getSimpleName());


        }
    }
}
