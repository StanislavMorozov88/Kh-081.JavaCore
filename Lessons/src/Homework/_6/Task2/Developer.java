package Homework._6.Task2;

public class Developer extends Employee{

    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report(){
        return  "Name: " + getName() + ", " +
                "Age: " + getAge() + "years, " +
                "Position: " + position + ", " +
                "Salary: " + getSalary();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
