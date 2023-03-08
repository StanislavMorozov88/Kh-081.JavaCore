package homework05;

public class Developer extends Employee {
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public String report() {
        return super.report();
    }

    @Override
    public String toString() {
        return "Developer{}";
    }
}

class DemoDeveloper {
    public static void main(String[] args) {
        Developer[] developers = new Developer[3];
        developers[0] = new Developer("Yaroslav", 34, 50000.3);
        developers[1] = new Developer("Oleh", 28, 30500.6);
        developers[2] = new Developer("Olha", 38, 44000.6);

        for (Developer developer : developers) {
            System.out.println(developer.report());
        }
    }
}