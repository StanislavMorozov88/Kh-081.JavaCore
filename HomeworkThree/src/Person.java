 import java.time.Year;
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

        public int getAge() {
            Year year = Year.now();
            return year.getValue() - this.birthYear;
        }

        public void input() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your first name: ");
            firstName = scanner.nextLine();

            System.out.print("Enter your last name: ");
            lastName = scanner.nextLine();

            System.out.print("Enter your birth year: ");
            birthYear = scanner.nextInt();

            scanner.close();
        }

        public void output() {
            System.out.println("Your name is " + firstName + " and last name is " + lastName);
            System.out.println("You was born in " + birthYear);
            System.out.println("You are " + getAge());
        }

        public void changeName(String fn, String ln) {
            lastName = ln;
            firstName = fn;
        }

        public static void main(String[] args) {
            Person p1 = new Person("Daria", "Shevchuk");
            Person p2 = new Person("Nadia", "Koval");
            Person p3 = new Person();
            Person p4 = new Person();
            Person p5 = new Person();

            p1.setBirthYear(1996);
            p2.setBirthYear(1991);
            p3.setBirthYear(2004);
            p4.setBirthYear(2003);
            p5.setBirthYear(2002);
            p3.output();
            p2.output();

            p3.changeName("Dariia", "Shevchyk");

            p1.input();
            p1.output();
        }

    }

