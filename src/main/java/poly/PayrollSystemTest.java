package poly;

public class PayrollSystemTest {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("john","smith", "111-11-1111", 800.00);
        System.out.printf("%nSalaried Employee: %s%n%s%f%n%n", salariedEmployee.toString(),"Total pay: ", salariedEmployee.earnings());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("karen","price", "222-22-2222", 16.75, 40);
        System.out.printf("Hour Employee: %s%n%s%f%n%n", hourlyEmployee.toString(), "Total pay: ", hourlyEmployee.earnings());

        CommissionEmployee commissionEmployee = new CommissionEmployee("some", "body", "333-33-3333", 1000, 0.5);
        System.out.printf("Commission Employee: %s%n%s%f%n%n", commissionEmployee.toString(), "Total pay: ", commissionEmployee.earnings());

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
            "no", "body", "444-44-4444", 20000, 0.6, 10000
        );
        System.out.printf("Base + Commission Employee: %s%n%s%f%n%n", basePlusCommissionEmployee.toString(), "Total pay: ", basePlusCommissionEmployee.earnings());


       // Employee array
        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("%nEmployees processed in polymorphic manner:%n%n");

        for (Employee currentEmployee: employees) {
            System.out.printf("%s", currentEmployee);

            // determine if element is BPCE
            if(currentEmployee instanceof BasePlusCommissionEmployee) {

                // downcast Employee reference to BPCE reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%.2f%n",
                    employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        // get type name of each object in employees array
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%n%nEmployee %d is a %s%n", i, employees[i].getClass().getName());
        }
    }
}
