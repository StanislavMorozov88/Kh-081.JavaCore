package homework02;

public class MainPerson {

    public static void main(String[] args) {
        Person p1 = new Person("Helena", "Brown");
        p1.setBirthYear(2000);
        Person p2 = new Person("Bob", "Marley");
        p2.setBirthYear(1995);
        Person p3 = new Person("Alice", "Cooper");
        p3.setBirthYear(1975);
        Person p4 = new Person("Marco", "Polo");
        p4.setBirthYear(1960);
        Person p5 = new Person("Mike", "Tyson");
        p5.setBirthYear(1980);

        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " is " + p1.getPersonAge());
        System.out.println(p2.getFirstName() + " " + p2.getLastName() + " is " + p2.getPersonAge());
        System.out.println(p3.getFirstName() + " " + p3.getLastName() + " is " + p3.getPersonAge());
        System.out.println(p4.getFirstName() + " " + p4.getLastName() + " is " + p4.getPersonAge());
        System.out.println(p5.getFirstName() + " " + p5.getLastName() + " is " + p5.getPersonAge());

    }

}
