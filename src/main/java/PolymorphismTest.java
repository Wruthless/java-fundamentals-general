public class PolymorphismTest {

    public static void main(String[] args) {

        // superclass reference to superclass variable
        CommissionEmployee commissionEmployee = new CommissionEmployee(
            "Sue","Jones","222-22-2222",10000, .06
        );

        // subclass reference to subclass variable
        // InhBasePlusCommissionEmployee extends CommissionEmployee
        InhBasePlusCommissionEmployee inhBasePlusCommissionEmployee = new InhBasePlusCommissionEmployee(
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300
        );

        // toString on superclass object using superclass variable
        System.out.printf("%s : %n%n%s%n%n",
            "Superclass toString with superclass reference to object", commissionEmployee.toString());

        // toString on subclass object using subclass variable
        System.out.printf("%s : %n%n%s%n%n",
            "Subclass toString with subclass reference to object", inhBasePlusCommissionEmployee.toString());

        CommissionEmployee commissionEmployee1 = inhBasePlusCommissionEmployee;

        System.out.printf("%s : %n%n%s%n%n",
            "Subclass toString with superclass reference to subclass object",commissionEmployee1.toString()
            );
    }
}
