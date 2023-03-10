package lesson08.hometask;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name is null");
        }
        this.fullName = fullName;
        this.age = age;
    }

    public static class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            if (firstName == null || lastName == null) {
                throw new IllegalArgumentException("First name or last name is null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public void info() {
        System.out.printf("First name: %s, Last name: %s, Age: %d ", fullName.firstName, fullName.lastName, age);
    }

    protected abstract String activity();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }
}
