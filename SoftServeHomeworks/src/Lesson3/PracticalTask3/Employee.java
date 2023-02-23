package Lesson3.PracticalTask3;

public class Employee {
    private String name;
    private float rate;
    private float hours;
    private static float totalSum;
    private static float salary;
    private static double bonuses;
    public Employee() {
        totalSum += getSalary();
    }
    public Employee(String name, float rate, float hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public Employee(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
    public float getSalary(){
        return salary = hours*rate;

    }
    public double getBonuses(){
        return bonuses = getSalary()*0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        Employee per1 = new Employee("Nik" , 10f , 10f);
        Employee per2 = new Employee("wer" , 12f , 12f);
        Employee per3 = new Employee();
        per3.setName("dik");
        per3.setHours(13);
        per3.setRate(13);
        float sal1 = per1.getSalary();
        float sal2 = per2.getSalary();
        float sal3 = per3.getSalary();
        totalSum+=sal3;
        //  я запустил дебаггер и понял, что у меня при создании объекта через сеттер, когда зарплата приплюсовалась,
        //  она плюсовалась как 0, потому что все данные
        //  задавались после того, как объект создавался из-за этого сделал так, не смог разобраться, как сделать так, чтоб оно считало,
        // при создании конструктором все было ок
        double bon1 = per1.getBonuses();
        double bon2 = per2.getBonuses();
        double bon3 = per3.getBonuses();
        System.out.println(sal3);
        System.out.println(totalSum);
        System.out.println(per1);
        System.out.println(bon3);
    }


}


