public class InhBasePlusCommissionEmployeeTest {

    public static void main(String[] args) {

        InhBasePlusCommissionEmployee inhBasePlusCommissionEmployee = new InhBasePlusCommissionEmployee(
            "Bob", "Blue", "666-66-6666", 100.00, 0.05, 5000.00
        );
        System.out.printf("%n%s%n", inhBasePlusCommissionEmployee.toString());
    }
}
