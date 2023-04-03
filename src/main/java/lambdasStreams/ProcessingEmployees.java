package lambdasStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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


        // Display first Employee with a salary between $4-6k
        System.out.printf("%nFirst employee who earns between $4-6k: %n%s%n",
            list.stream()
                .filter(fourToSixThousand)
                .findFirst()
                .get());

        // Get first and last name
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first and then last name
        Comparator<Employee> lastThenFirst = Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort by last then first name
        System.out.printf("%nEmployee in asc order by last then first name: %n");
            list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        System.out.printf("%nEmployees in desc order by last then first name: %n");
        list.stream()
            .sorted(lastThenFirst.reversed())
            .forEach(System.out::println);

        // unique employees sorted by last name
        System.out.printf("%nUnique employees by last name: %n");
        list.stream()
            .map(Employee::getLastName)
            .distinct()
            .sorted()
            .forEach(System.out::println);

        // display first and last
        System.out.printf("%nEmployee names in order by last then first name: %n");
        list.stream()
            .sorted(lastThenFirst)
            .map(Employee::getName)
            .forEach(System.out::println);

    }
}
