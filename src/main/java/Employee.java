public class Employee {

    // reference-type instance variables, initialized to null (unless constructor)
    private String firstName;
    private String lastName;
    private Date birthDate; // DD/MM/YYYY Date.toString()
    private Date hireDate;  // DD/MM/YYYY Date.toString()

    // constructor, init name, bd, hd
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;

    }

    public String toString() {
        return String.format("%s, %s%nHired: %12s%nBirthday: %9s%n", lastName, firstName, hireDate, birthDate);
    }
}