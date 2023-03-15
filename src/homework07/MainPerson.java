package homework07;

public class MainPerson {
    public static void main(String[] args) {

        Person.FullName fullName = new Person.FullName("Mikkey", "Mouse", 15, "Mikkey Mouse");


        fullName.info();
        System.out.println(fullName.activity());
        }
}
