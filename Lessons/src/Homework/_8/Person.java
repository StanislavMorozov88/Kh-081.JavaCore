package Homework._8;

public abstract class Person implements Cloneable {

    protected FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public abstract String activity();

    public String info() {
        return  "First name: \033[0;36m"+ fullName.getFirstName() +
                "\033[0m, Last name: \033[0;36m" + fullName.getLastName() +
                "\033[0m, Age: \033[0;36m" + age + "\033[0m";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person copyOfPerson = (Person) super.clone();
        copyOfPerson.fullName = (FullName) copyOfPerson.fullName.clone();
        return copyOfPerson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
