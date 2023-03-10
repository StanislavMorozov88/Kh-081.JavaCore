package lesson08.hometask.with_copy_constructor;

public abstract class Person {
    private FullName fullName;
    private int age;

    protected Person(FullName fullName, int age) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name is null");
        }
        this.fullName = fullName;
        this.age = age;
    }

    protected Person(Person another) {
        if (another == null) {
            throw new IllegalArgumentException("Person is null");
        }
        this.fullName = new FullName(another.fullName);
        this.age = another.age;
    }

    public static class FullName {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) {
            if (firstName == null || lastName == null) {
                throw new IllegalArgumentException("First name or last name is null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public FullName(FullName fullName) {
            this(fullName.firstName, fullName.lastName);
        }
    }

    public void info() {
        System.out.printf("First name: %s, Last name: %s, Age: %d ", fullName.firstName, fullName.lastName, age);
    }

    protected abstract String activity();
}
