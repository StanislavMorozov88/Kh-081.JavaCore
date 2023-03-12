package edu06.homework.task2;

public class Developer extends Worker {
    private String position;

    public Developer(String name, int age, String position, double salary) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    //public String report() {
        //return String.format("Name: %s, Age: %d, Position: %d, Salary: \u20B4 %%2.f.", name, age, position, salary);
    //}

    public void report(){
        System.out.println("Name: " + name + ", Age: " + age + ", Position: "+ position + ", Salary: " + salary);
    }
}
