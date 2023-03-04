package lesson06.home.employees;

public class MainTest {
    public static void main(String[] args) {
        //Не роблю ніяких перевірок, вважаємо, що всі дані коректні.
        Employee[] employees = {
                new Developer("John", 30, 105250, "Senior Java developer"),
                new Employee("Kevin", 45, 75555),
                new Developer("Helga", 31, 125000, "Lead Python developer"),
                new Employee("Helga", 31, 125000)
        };

        for (Employee employee : employees) {
            System.out.println(employee.report());
        }
    }
}
