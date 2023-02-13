public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
            "Bob","Lewis","222-22-2222", 5000, .05, 300
        );

        System.out.printf("%s%n", basePlusCommissionEmployee.toString());

    } // end main

} // end BasePlusCommissionEmployeeTest class
