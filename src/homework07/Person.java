package homework07;

abstract public class Person {
    //private FullName fullname = new Fullname();
    public abstract String activity();
    private int age;

    public Person(String fullName, int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class FullName extends Person {
        private String firstName;
        private String lastName;

        @Override
        public String activity() {
            return "I like be funny))";
        }

        public FullName(String firstName, String lastName, int age, String fullName) {
            super(fullName, age);
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

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        public void info() {
            System.out.println("First name: " + firstName + ", Last name: " + lastName + ", Age: " + getAge());
        }

    }
}


