package homework06;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String employeeId) {
        super(employeeId);
    }

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public SalariedEmployee(String employeeId, String socialSecurityNumber, double hourlyRate, int numberOfHoursWorked) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
        @Override
        public double calculatePay() {
            return hourlyRate * numberOfHoursWorked;
        }
        public String getSocialSecurityNumber() {
            return socialSecurityNumber;
        }

        public void setSocialSecurityNumber (String socialSecurityNumber){
            this.socialSecurityNumber = socialSecurityNumber;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate( double hourlyRate){
            this.hourlyRate = hourlyRate;
        }

        public int getNumberOfHoursWorked() {
            return numberOfHoursWorked;
        }

        public void setNumberOfHoursWorked( int numberOfHoursWorked){
            this.numberOfHoursWorked = numberOfHoursWorked;
        }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                '}';
    }

}

