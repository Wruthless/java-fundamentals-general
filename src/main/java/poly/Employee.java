package poly;

public abstract class Employee {

    private final String firstName;
    private final String lastName;
    private final String ssn;

    // constructor
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    // firstName getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    // no setters since fields are final and are being set by the constructor


    @Override
    public String toString() {
        return "Employee{" +
            "firstName='" + getFirstName() + '\'' +
            ", lastName='" + getLastName() + '\'' +
            ", ssn='" + getSsn() + '\'' +
            '}';
    }

    // abstract method must be overridden by concrete subclasses
    public abstract double earnings(); // no implementation
}