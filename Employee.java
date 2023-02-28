public class Employee{
    //public static void Employee(string[] args){
        private String name;
        private double rate;
        private int hours;
        public static double totalSum;

        //constructor
    public  Employee(){
    }

    public Employee(String name, double rate){
            this.name=name;
            this.rate=rate;

    }
    public Employee(String name, double rate, int hours){
        this.name=name;
        this.rate=rate;
        this.hours=hours;

    }
    // getter , setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //to String
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getSalary(){
        return rate * hours;
        }

        public double getBonuses() {
            return (rate * hours) / 10;
            // zp - 100%
            //  bn  - 10%
        }
            public double fullSalary(){
                return ((rate*hours)+((rate*hours)/10));
            }

           // public double getTotalSum(){

          //  }
    }
