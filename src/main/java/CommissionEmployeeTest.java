public class CommissionEmployeeTest {

    public static void main(String[] args) {

        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
            "111-11-1111", 1000, .07);

        System.out.printf("%s%n", commissionEmployee.toString());
        System.out.printf("%f%n", commissionEmployee.earnings());

    } // end main

} // end CommissionEmployeeTest class
