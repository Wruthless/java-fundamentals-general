public class InhBasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public InhBasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary) {

        // pass parameters to super class constructor
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);

        if(baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        // not allowed: commissionRate and grossSales private in superclass
        // changed to protected
        return baseSalary + (commissionRate * grossSales);
    }

    @Override
    public String toString() {
        // now that fields are protected they are directly accessible
        return "InhBasePlusCommissionEmployee{" +
            "firstName=" + firstName + " " +
            "lastName=" + lastName + " " +
            "commissionRate=" + commissionRate + " " +
            "ssn=" + socialSecurityNumber + " " +
            "grossSales=" + grossSales + " " +
            "baseSalary=" + baseSalary +
            '}';
    }

}

