package lesson7.hw;

//Create an abstract Person class with fullName field of type FullName and age of type int.
//In the Person class, create a constructor
//      public Person(FullName fullName, int age)
//      and a method called info(), which will return a string in the format
//        "First name: <firstName>, Last name: <lastName>, Age: <age>"
//  and an abstract public activity() method with a String return type.

abstract public class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + ", Last name: " + fullName.getLastName() + ", Age: " + age;
    }

    abstract public String activity();
}
