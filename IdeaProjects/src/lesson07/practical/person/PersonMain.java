package lesson07.practical.person;

public class PersonMain {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        personService.add(new Teacher("Marina",30000));
        personService.add(new Cleaner("Maria",10000));
        personService.add(new Student("Olena"));
        Staff staff = new Teacher("Ehor",29000);
        personService.add(staff);
        personService.personsSalaryMethod();
        personService.personsPrintMethod();
        System.out.println(personService);
    }
}
