package polyInterface;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        // call super to initialize fN, lN and ssn
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

//    @Override
//    public double earnings() {
//        return getWeeklySalary();
//    }

    // override toString to give SalariedEmployee an appropriate representation
    // than what is inherited from the super class.
    @Override
    public String toString() {
        return "SalariedEmployee { " +
            "super = " + super.toString() + " " +
            "weeklySalary = " + getWeeklySalary() +
            '}';
    }

    @Override
    // replace earnings method to satisfy interface
    public double getPaymentAmount() {
        return getWeeklySalary();
    }

} // end SalariedEmployee class
