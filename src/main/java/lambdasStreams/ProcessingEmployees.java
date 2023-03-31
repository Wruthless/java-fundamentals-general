package lambdasStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcessingEmployees {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("Jason", "Red", 5000, "IT"),
            new Employee("Ashley", "Green", 7600, "IT"),
            new Employee("James", "Indigo", 3857.5, "Sales"),
            new Employee("Luke", "Indigo", 4700.77, "Marketing"),
            new Employee("Matthew", "Indigo", 6200, "IT"),
            new Employee("Jason", "Blue", 3200, "Sales"),
            new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get list view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display them
        System.out.println("Complete Employee List:");
        list.stream().forEach(System.out::println);

        // Predicate that return true for salaries between 4 and 6k
        Predicate<Employee> fourToSixThousand =
            employee -> (employee.getSalary() >= 4000 && employee.getSalary() <= 6000);

        System.out.printf("%nEmployees earning between 4 and 6k sorted by salary:%n");
        list.stream()
            .filter(fourToSixThousand)
            .sorted(Comparator.comparing(Employee::getSalary))
            .forEach(System.out::println);
    }
}
