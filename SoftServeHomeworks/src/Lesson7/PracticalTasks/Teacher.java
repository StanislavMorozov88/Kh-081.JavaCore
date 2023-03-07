package Lesson7.PracticalTasks;

public class Teacher extends Staff {
    private final String TYPE_PERSON;
    public Teacher(String name, int salary) {
        super(name,salary);
        this.TYPE_PERSON = "Teacher";
    }
    @Override
    public void print() {
        super.print();
        System.out.print(TYPE_PERSON + " My name is " + getName());
    }
    @Override
    public void salary() {
        System.out.println();
        System.out.println("My salary is " + getSalary());
        System.out.println();
    }
    @Override
    public String toString() {
        return "Teacher" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'';
    }
}
