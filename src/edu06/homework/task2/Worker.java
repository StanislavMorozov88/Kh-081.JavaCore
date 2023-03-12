package edu06.homework.task2;

 public class Worker {
    public String name;
    public int age;
    public double salary;

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

     @Override
     public String toString() {
         return "Worker{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", salary=" + salary +
                 '}';
     }

     //public String report(){
       // return String.format("Name: %s, Age: %d, Salary: \u20B4 %%2.f.", name, age, salary);
    //}

    public void report(){
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }

}
