package lesson03.practicaltasks;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;
    private static final int BONUS_RATE = 10;

    public Employee() {
    }

    public Employee(String name) {
        checkName(name);
        this.name = name;
    }

    public Employee(String name, double rate, int hours) {
        checkName(name);
        checkRate(rate);
        checkHours(hours);
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        increaseTotalSum();
    }

    private double getSalary(){
        return rate * hours;
    }

    private double getBonus(){
        return (getSalary()*BONUS_RATE)/100;
    }

    public static void printTotalSalary(){
        System.out.println("Total salary with bonus of all employees is: " + totalSum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (isPaid()){
            decreaseTotalSum();
        }
        checkRate(rate);
        this.rate = rate;
        increaseTotalSum();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (isPaid()){
            decreaseTotalSum();
        }
        checkHours(hours);
        this.hours = hours;
        increaseTotalSum();
    }

    private void checkName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    private void checkRate(double rate){
        if (rate < 0){
            throw new IllegalArgumentException("Rate is negative");
        }
    }

    private void checkHours(int hours){
        if (hours <0){
            throw new IllegalArgumentException("Hours is negative");
        }
    }

    private boolean isPaid(){
        return rate > 0 && hours >0;
    }

    private void decreaseTotalSum(){
        totalSum-=(getSalary()+getBonus());
    }

    private void increaseTotalSum(){
        totalSum+=(getSalary()+getBonus());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
